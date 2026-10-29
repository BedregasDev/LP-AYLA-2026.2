package br.ufpb.dcx.bedregal.daniel.comidaRU;

import java.util.Scanner;
public class OrganizacaoAlmocoRU{
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos almoços foram realizados?");
        int quantAlmocos = Integer.parseInt(leitor.nextLine());

        double valorTotal = 0;

        for(int k = 0; k< quantAlmocos;k++){
            System.out.println("Qual o preço dessa refeição?");
            double preco = Double.parseDouble(leitor.nextLine());
            valorTotal += preco;
        }
        System.out.println("O valor total gasto de almoço no Ru foi de "+
                valorTotal+" reais.");
    }
}
