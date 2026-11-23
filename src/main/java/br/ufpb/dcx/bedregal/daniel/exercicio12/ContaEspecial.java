package br.ufpb.dcx.bedregal.daniel.exercicio12;

public class ContaEspecial extends Conta{
    private double credito;

    public ContaEspecial(String cpf, String numC, String numAg, double saldo, double credito) {
        super(cpf, numC, numAg, saldo);
        this.credito = credito;
    }
    public double getSaldoDisponivel(){
        return this.credito + this.getSaldo();
    }
}
