package br.ufpb.dcx.bedregal.daniel.programasIniciais;

import java.util.Scanner;

public class TesteArrays {
    public static void main(String [] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos números terá na lista?");

        int quantNumeros = Integer.parseInt(leitor.nextLine());

        int [] idades =new int [quantNumeros];

        for(int k = 0;k<quantNumeros;k++){
            System.out.println("Digite um número");

            idades[k] = Integer.parseInt(leitor.nextLine());

        }
        for (int k = 0; k < quantNumeros; k++) {
            System.out.print(idades[k] + " ");
        }

    }
}
