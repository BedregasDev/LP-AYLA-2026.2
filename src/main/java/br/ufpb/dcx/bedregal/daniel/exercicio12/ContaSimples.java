package br.ufpb.dcx.bedregal.daniel.exercicio12;

public class ContaSimples extends Conta{
    public ContaSimples(String cpf, String numC, String numAg, double saldo){
        super(cpf,numC,numAg,saldo);
    }
    public double getSaldoDisponivel(){
        return this.getSaldo();
    }
}
