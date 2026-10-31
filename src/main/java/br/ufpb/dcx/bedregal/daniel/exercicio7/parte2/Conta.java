package br.ufpb.dcx.bedregal.daniel.exercicio7.parte2;

public class Conta {
    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta(){}

    public Conta(String cpfTitular, String numeroConta,String numeroAgencia,double saldo){
        this.cpfTitular = cpfTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }
    public String getCpfTitular(){
        return this.cpfTitular;
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setCpfTitular(String cpfTitular){
        this.cpfTitular = cpfTitular;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setNumeroAgencia(String numeroAgencia){
        this.numeroAgencia =numeroAgencia;
    }
    public double debitar(double valor){
        return saldo -= valor;
    }
    public double creditar(double valor) {
        return saldo += valor;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String toString(){
        return "Conta número "+this.numeroConta+" do cliente de CPF "+this.cpfTitular;
    }
}
