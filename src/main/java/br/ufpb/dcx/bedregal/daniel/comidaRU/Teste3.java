package br.ufpb.dcx.bedregal.daniel.comidaRU;

import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
        for (int k = 0; k < quantidadeRefeicoes; k++) {
            System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
            String matricula = leitor.nextLine();
            System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR"); String tipoRefeicao = leitor.nextLine();
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
            System.out.printf("%s\n", refeicoes[k].toString());
        }

        int totalAlmocos = quantAlmocosRealizados(refeicoes);
        System.out.println("A quantidade total de almoços realizadas foi de: "+ totalAlmocos);

        boolean houveCafe = verificarSeTipoRefeicaoFoiCafe(refeicoes);
        if (houveCafe == true) {
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }

        System.out.printf("FIM DO PROGRAMA");
        leitor.close();
    }// fim do main

    public static int quantAlmocosRealizados(RefeicaoRealizada [] refeicoes){
        int quantAlmocos = 0;
        for (int i = 0; i<refeicoes.length;i++){
            if(refeicoes[i].getTipoRefeicao().equalsIgnoreCase("ALMOÇO")){
                quantAlmocos++;
            }
        }
        return quantAlmocos;
    }
    public static boolean verificarSeTipoRefeicaoFoiCafe(RefeicaoRealizada [] refeicoes){
        for(int k = 0; k<refeicoes.length;k++){
            if(refeicoes[k].getTipoRefeicao().equalsIgnoreCase("CAFÉ")){
                return true;
            }
        }
        return false;
    }

} // fim da classe Teste 3

