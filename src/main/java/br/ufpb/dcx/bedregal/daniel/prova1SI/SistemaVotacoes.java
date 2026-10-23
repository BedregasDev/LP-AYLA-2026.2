package br.ufpb.dcx.bedregal.daniel.prova1SI;

import br.ufpb.dcx.bedregal.daniel.prova1LCC.Voto;

import java.util.Scanner;

public class SistemaVotacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas vão votar?");
        int numVotantes = Integer.parseInt(leitor.nextLine());
        br.ufpb.dcx.bedregal.daniel.prova1LCC.Voto[] votos = new br.ufpb.dcx.bedregal.daniel.prova1LCC.Voto[numVotantes];
        for (int k = 0; k < numVotantes; k++) {
            System.out.println("Qual o seu código de votante?");
            String codigo = leitor.nextLine();
            System.out.println("Qual o seu voto? 1. Chapa Vamos vencer;"
                    + " 2. Chapa É isso aí; 3. Chapa Vamos Construir");
            int numeroChapa = Integer.parseInt(leitor.nextLine());
            votos[k] = new br.ufpb.dcx.bedregal.daniel.prova1LCC.Voto(codigo, numeroChapa);
        }
//        imprimeResultadoVotacoes(votos);
        contaVotosDaChapa(1,votos);
        if (verificarSeHouveChapaSemVotos(votos)) {
            System.out.println("Houve chapa sem votos");
        } else {
            System.out.println("Todas as chapas tiveram algum voto");
        }
        leitor.close();
    }

    public static void imprimeResultadoVotacoes(Voto[] votos) {
        System.out.println("Resultado da votação:");
        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosChapa3 = 0;
        int votosNulos = 0;
        int i = 0;
        do {
            if (votos[i].getNumeroChapa() == 1) {
                votosChapa1 += 1;
            } else if (votos[i].getNumeroChapa() == 2) {
                votosChapa2 += 1;
            } else if (votos[i].getNumeroChapa() == 3) {
                votosChapa3 += 1;
            } else {
                votosNulos += 1;
            }
            i += 1;
        } while (i < votos.length);
        System.out.println("Votos chapa 1:" + votosChapa1);
        System.out.println("Votos chapa 2:" + votosChapa2);
        System.out.println("Votos chapa 3:" + votosChapa3);
        System.out.println("Votos Nulos:" + votosNulos);
    }
//Questão 2:

    public static void contaVotosDaChapa(int numeroChapa, Voto[] votos) {
        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosChapa3 = 0;
        int votosNulos = 0;

        for (int k = 0; k < votos.length; k++) {
            if (votos[k].getNumeroChapa() == 1) {
                votosChapa1 += 1;
            } else if (votos[k].getNumeroChapa() == 2) {
                votosChapa2 += 1;
            } else if (votos[k].getNumeroChapa() == 3) {
                votosChapa3 += 1;
            } else {
                votosNulos += 1;
            }
        }
        if (numeroChapa == 1) {
            System.out.println("A quantidade de votos da chapa 1 foi de : " + votosChapa1);
        } else if (numeroChapa == 2) {
            System.out.println("A quantidade de votos da chapa 2 foi de : " + votosChapa2);
        } else if (numeroChapa == 3) {
            System.out.println("A quantidade de votos da chapa 3 foi de : " + votosChapa3);
        } else {
            System.out.println("A quantidade de votos nulos foi de : " + votosNulos);
        }
    }

//Questão 3:
    public static boolean verificarSeHouveChapaSemVotos(Voto [] votos){
        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosChapa3 = 0;

        for(int k = 0; k < votos.length; k++){
            if (votos[k].getNumeroChapa() == 1) {
                    votosChapa1 += 1;
            } else if (votos[k].getNumeroChapa() == 2) {
                    votosChapa2 += 1;
            } else if (votos[k].getNumeroChapa() == 3) {
                    votosChapa3 += 1;
            }
        }
        if(votosChapa1 == 0|| votosChapa2 == 0 || votosChapa3 == 0){
            return true;
        }
        else{
            return false;
        }

    }
}
