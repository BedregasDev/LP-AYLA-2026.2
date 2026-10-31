package br.ufpb.dcx.bedregal.daniel.exercicio7.parte2;

import java.util.ArrayList;

public class TestaBanco {
    public static void main(String[] args) {
        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3"));

        // a) Abrir mais uma conta no banco
        meuBanco.abrirConta("999.999.999-99", "444-4", "333-3", 0);

        // b) Transferir 100 reais da conta "222-2" (agência "333-3") para a conta criada
        meuBanco.transferir("222-2", "333-3", "444-4", "333-3", 100);

        // c) Imprimir o saldo da conta criada
        System.out.println(meuBanco.consultarSaldoDeConta("444-4", "333-3"));

        // d) Pesquisar as contas com saldo negativo e imprimir cada uma
        ArrayList<Conta> negativas = meuBanco.pesquisarContasComSaldoNegativo();
        for (Conta c : negativas) {
            System.out.println(c);
        }
    }
}