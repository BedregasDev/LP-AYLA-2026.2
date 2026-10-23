package br.ufpb.dcx.bedregal.daniel.prova1SI;

import java.util.Scanner;

public class ProgramaLerCodigosVotantes {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int quantVotantes = 3;
        String [] codigos = new String [quantVotantes];

        for (int k = 0; k < quantVotantes ; k++){
            System.out.println("Qual seu código de votante? ");
            codigos[k] = leitor.nextLine();
        }

        System.out.println("Qual código voçe deseja encontrar?");
        String codigoEncontrado=leitor.nextLine();
        int quantCodigoEncontrado = 0;

        for(int i = 0; i < codigos.length; i++){
            if(codigos[i].equals(codigoEncontrado)){
                quantCodigoEncontrado += 1;
            }
        }
        System.out.println("O código votante "+codigoEncontrado+" foi encontrado "+
                quantCodigoEncontrado+" vezes.");
        leitor.close();
    }
}
