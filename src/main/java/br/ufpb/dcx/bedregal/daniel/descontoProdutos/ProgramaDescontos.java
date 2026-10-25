package br.ufpb.dcx.bedregal.daniel.descontoProdutos;

import java.util.Scanner;

public class ProgramaDescontos {
//
//    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Quantos produtos você quer comprar?");
//        int quant = Integer.parseInt(leitor.nextLine());
//        Produto[] produtos = new Produto[quant];
//
//        for (int k = 0; k < quant; k++) {
//            Produto p = new Produto();
//            System.out.println("Qual o nome do produto?");
//            p.setNome(leitor.nextLine());
//            System.out.println("Qual o preço original do produto?");
//            p.setPreco(Double.parseDouble(leitor.nextLine()));
//            double valorComDesconto =
//                    calculaValorComDesconto(p.getPreco());
//            System.out.printf(
//                    "O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);
//            produtos[k] = p;
//        }
//        leitor.close();
//    }
//
//    public static double calculaValorComDesconto(double valorProduto) {
//        if (valorProduto < 50) {
//            return (valorProduto);
//        } else if (valorProduto < 100) {
//            return (valorProduto - (valorProduto * 0.05));
//            // 5% de desconto se valor entre 50 e 100 (sem incluir 100)
//        } else {
//            return (valorProduto - (valorProduto * 0.10));
//            // 10% de desconto
//        }
//    }
//    public static double calculaSomatorioDescontos(Produto [] produtos){
//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Quantos produtos voce deseja comprar?");
//        int quantProdutos = Integer.parseInt(leitor.nextLine());
//        Produto [] produtos = new Produto[quantProdutos];
//        int descontoTotal = 0;
//        for(int i = 0; i < produtos.length; i++){
//
//        }
//    }
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos voce deseja comprar?");
        int quantProdutos = Integer.parseInt(leitor.nextLine());
        Produto[] produtos = new Produto[quantProdutos];
        int descontoTotal = 0;
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Qual o nome do produto?");
            String nome = leitor.nextLine();
            System.out.println("Qual o preço do produto?");
            double preco = Double.parseDouble(leitor.nextLine());
            produtos[i] =new Produto(nome,preco);
        }
        for(int i = 0; i<produtos.length; i++){
            System.out.println(produtos[i].getNome() +" "+ produtos[i].getPreco());
        }
    }
}


