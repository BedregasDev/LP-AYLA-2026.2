package br.ufpb.dcx.bedregal.daniel.prova1LCC;

import java.util.Scanner;

public class SistemaVotacoes {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas vão votar?");
        int numVotantes = Integer.parseInt(leitor.nextLine());
        Voto [] votos = new Voto [numVotantes];
        for (int k=0; k< numVotantes; k++) {
            System.out.println("Qual o seu código de votante?");
            String codigo= leitor.nextLine();
            System.out.println("Qual o seu voto? 1. Chapa Vamos vencer;"
                    +" 2. Chapa É isso aí; 3. Chapa Vamos Construir");
            int numeroChapa = Integer.parseInt(leitor.nextLine());
            votos[k]  = new Voto(codigo, numeroChapa);
        }
        imprimeResultadoVotacoes(votos);
        int chapaVencedora = qualChapaTemMaisVotos(votos);
        if (chapaVencedora == -1){
            System.out.println("Houve um empate!");
        }else{
            System.out.println("A chapa vencedora foi a"+ chapaVencedora);
        }
        if(verificarSeEstudanteVotou("E333",votos)){
            System.out.println("Voto computado");
        }else{
            System.out.println("Voto não encontrado");
        }
        leitor.close();
    }

    public static void imprimeResultadoVotacoes(Voto[] votos){
        System.out.println("Resultado da votação:");
        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosChapa3 = 0;
        int votosNulos = 0;
        int i=0;
        do {
            if (votos[i].getNumeroChapa()==1){
                votosChapa1+=1;
            } else if (votos[i].getNumeroChapa()==2){
                votosChapa2+=1;
            } else if (votos[i].getNumeroChapa()==3){
                votosChapa3+=1;
            } else {
                votosNulos+=1;
            }
            i+=1;
        } while(i< votos.length);
        System.out.println("Votos chapa 1:"+votosChapa1);
        System.out.println("Votos chapa 2:"+votosChapa2);
        System.out.println("Votos chapa 3:"+votosChapa3);
        System.out.println("Votos Nulos:"+votosNulos);
    }
    //Questão 2:

    public static int qualChapaTemMaisVotos(Voto[] votos){
        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosChapa3 = 0;

        for(int i = 0;i<votos.length;i++){
            if (votos[i].getNumeroChapa() == 1){
                votosChapa1 += 1;
            }
            else if(votos[i].getNumeroChapa() == 2){
                votosChapa2 += 1;
            }
            else if(votos[i].getNumeroChapa() == 3){
                votosChapa3 += 1;
            }

        }
        if(votosChapa1 > votosChapa2 && votosChapa1>votosChapa3){
            return 1;
        }
        else if(votosChapa2 > votosChapa1 && votosChapa2>votosChapa3){
            return 2;
        }
        else if(votosChapa3 > votosChapa1 && votosChapa3>votosChapa2){
            return 3;
        }
        else{
            return -1;
        }
    }
    //Questão 3:
    public static boolean verificarSeEstudanteVotou(String codigo, Voto[] votos) {
        for (int i = 0; i < votos.length; i++) {
            if (votos[i].getCodigo().equals(codigo)) {
                return true; // achou: este estudante já votou
            }
        }
        return false; // percorreu todas as gavetas e não achou
    }
}
