package br.ufpb.dcx.bedregal.daniel.descontoProdutos;

import java.util.Scanner;

public class ProgramaDesconto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto[] produtos = new Produto[quant];
        for (int k = 0; k < quant; k++) {
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto =
                    calculaValorComDesconto(p.getPreco());
            System.out.printf(
                    "O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);
            produtos[k] = p;
        }
        leitor.close();
    }

    public static double calculaValorComDesconto(double valorProduto) {
        if (valorProduto < 50) {
            return (valorProduto);
        } else if (valorProduto < 100) {
            return (valorProduto - (valorProduto * 0.05));
        } else {
            return (valorProduto - (valorProduto * 0.10));
        }
    }

    public static double calculaSomatorioDescontos(Produto[] produtos) {
        double somatorio = 0.0;

        for (int i = 0; i < produtos.length; i++) {
            double precoOriginal = produtos[i].getPreco();
            double valorComDesconto = calculaValorComDesconto(precoOriginal);
            somatorio += precoOriginal - valorComDesconto;
        }

        return somatorio;
    }

    public static String verificaProdutoComMaiorDesconto(Produto[] produtos) {
        double maiorDesconto = -1.0;
        String nomeDoMaior = null;

        for (int i = 0; i < produtos.length; i++) {
            double precoOriginal = produtos[i].getPreco();
            double valorComDesconto = calculaValorComDesconto(precoOriginal);
            double desconto = precoOriginal - valorComDesconto;

            if (desconto > maiorDesconto) {
                maiorDesconto = desconto;
                nomeDoMaior = produtos[i].getNome();
            }
        }

        return nomeDoMaior;
    }
    //Questão 4:
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
//            produtos[k] = p;
//        }
//        leitor.close();
//
//        double totalDescontos = calculaSomatorioDescontos(produtos);
//        System.out.printf("O somatório dos descontos é R$ %.2f\n", totalDescontos);
//
//        String maisDesconto = verificaProdutoComMaiorDesconto(produtos);
//        System.out.println("O produto com maior desconto foi: " + maisDesconto);
//    }
}
