package br.ufpb.dcx.bedregal.daniel.programasIniciais.introduçãoPOO;





import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
//        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
//        System.out.println("Qual seu nome?");
//        String nome = leitor.nextLine();
//        System.out.println("Digite sua idade:");
//        int idade = Integer.parseInt(leitor.nextLine());
//
//        Pessoa p1 = new Pessoa(nome,idade);
//
//        boolean verificarSeEhMaiorDe18 = p1.ehDeMaior();
//        if(verificarSeEhMaiorDe18 == true){
//            System.out.println("É de maior pois tem "+p1.getIdade()+" anos.");
//        }else{
//            System.out.println("É de menor idade pois tem "+ p1.getIdade()+ " anos.");
//        }

        System.out.println("Quantas pessoas vc deseja cadastrar?");
        int quantPessoas = Integer.parseInt(leitor.nextLine());
        Pessoa[] pessoas = new Pessoa[quantPessoas];
        for (int indice = 0; indice < pessoas.length; indice++) {
            System.out.println("Digite seu nome pessoa" + (indice + 1));
            String nome = leitor.nextLine();
            System.out.println("Digite sua idade pessoa" + (indice + 1));
            int idade = Integer.parseInt(leitor.nextLine());

            pessoas[indice] = new Pessoa(nome, idade);

        }
        System.out.println("\n--- PESSOAS CADASTRADAS ---");
        for (int k = 0; k < pessoas.length; k++) {

            System.out.println("Pessoa " + (k + 1));
            System.out.println("Nome: " + pessoas[k].getNome());
            System.out.println("Idade: " + pessoas[k].getIdade());

            System.out.println("----------------------");


            boolean verificarSeEhMaiorDe18 = pessoas[k].ehDeMaior();

            if (verificarSeEhMaiorDe18 == true) {
                System.out.println("É de maior, pois tem " + pessoas[k].getIdade() + " anos.");
            } else {
                System.out.println("É de menor idade, pois tem " + pessoas[k].getIdade() + " anos.");
            }
        }
    }
}