package br.ufpb.dcx.bedregal.daniel.exercicio7.parte1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        int contador = 0;
        while (contador <5){
            System.out.println("Digite seu nome pessoa"+ (contador+1));
            String nome = leitor.nextLine();
            System.out.println("Digite sua idade pessoa"+ (contador+1));
            int idade = Integer.parseInt(leitor.nextLine());

            Pessoa pessoa = new Pessoa(nome,idade);
            pessoas.add(pessoa);
            contador++;
        }
        for(Pessoa pessoa : pessoas){
            if(pessoa.ehDeMaior()){
                System.out.println(pessoa.getNome() +" é de maior!");
            }else{
                System.out.println(pessoa.getNome() + " é de menor idade.");
            }
        }
    }
}