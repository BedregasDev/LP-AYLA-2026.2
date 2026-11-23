package br.ufpb.dcx.bedregal.daniel.exercicio12;

import java.util.ArrayList;

public class ProgramaBanco {
    public static void main(String [] args){
        SistemaBanco meuBanco = new BancoList("DanielBancs","434",new ArrayList<>());

        Conta c1 = new ContaEspecial("434454-74","333-9","44-3",100,300);
        meuBanco.abrirConta(c1);

        if(c1.getSaldoDisponivel() == 300){
            System.out.println("O saldo disponível é de R$" + c1.getSaldoDisponivel());
        }
        Conta c2 = new ContaEspecial("434454-74","444-5","44-3",0,1000);
        c2.debitar(100);
    }
}
