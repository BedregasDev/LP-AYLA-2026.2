package br.ufpb.dcx.bedregal.daniel.exercicio7.parte2;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome,String cnpj,ArrayList<Conta>contas){
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }
    public ArrayList<Conta> pesquisarContasComSaldoNegativo(){
        ArrayList<Conta> negativas = new ArrayList<Conta>();
        for(Conta c : contas){
            if (c.getSaldo() < 0){
                negativas.add(c);
            }
        }
        return negativas;
    }
    public void abrirConta(String cpfTitular,String numConta,
                           String numAgencia,double saldoInicial){
           Conta nova = new Conta(cpfTitular,numConta,numAgencia,saldoInicial);
           contas.add(nova);

    }
    public void transferir(String numContaO, String numAgO,
                           String numContaD, String numAgenciaD, double valor) {
        Conta origem = null;
        Conta destino = null;
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numContaO) && c.getNumeroAgencia().equals(numAgO)) {
                origem = c;
            }
            if (c.getNumeroConta().equals(numContaD) && c.getNumeroAgencia().equals(numAgenciaD)) {
                destino = c;
            }
        }
        if (origem != null && destino != null) {
            origem.debitar(valor);
            destino.creditar(valor);
        }
    }
    public double consultarSaldoDeConta(String numConta,String numAgencia){
        for(Conta c : contas){
            if(c.getNumeroConta().equals(numConta) &&
                    c.getNumeroAgencia().equals(numAgencia)){
                return c.getSaldo();
            }
        }
        return 0;
    }
}
