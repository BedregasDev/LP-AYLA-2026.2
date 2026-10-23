package br.ufpb.dcx.bedregal.daniel.prova1LCC;

import java.util.Scanner;

public class ProgramaLerNomes {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int quantNomes = 10;
        String [] nomes = new String[quantNomes];

        for(int k =0; k < quantNomes; k++){
            System.out.println("Digite um nome: ");
            nomes[k] = leitor.nextLine();
        }
        int quantNomesComecamComLetraA = 0;
        for (int k = 0; k<quantNomes; k++){
            if(nomes[k].startsWith("A") || nomes[k].startsWith("a")){
                quantNomesComecamComLetraA += 1;
            }
        }
        System.out.println(quantNomesComecamComLetraA);
        leitor.close();
    }
}
