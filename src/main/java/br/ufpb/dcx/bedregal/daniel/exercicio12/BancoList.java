package br.ufpb.dcx.bedregal.daniel.exercicio12;

import java.util.List;
import java.util.ArrayList;

public class BancoList implements SistemaBanco{
    private String nome;
    private String cnpj;
    private List<Conta> contas;

    public BancoList(String nome,String cnpj,List<Conta> contas){
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = new ArrayList<>();
    }
    public List<Conta> pesquisarContasComSaldoNegativo(){
        List<Conta> contasPesq = new ArrayList<>();
        for(Conta c: this.contas){
            if(c.getSaldo()<0){
                contasPesq.add(c);
            }
        }return contasPesq;
    }
    public boolean abrirConta(Conta novaConta){
        for (Conta c : this.contas) {
            if (c.equals(novaConta)) {
                return false;
            }
        }
        this.contas.add(novaConta);
        return true;
    }
    public void transferir(String numContaO,String numAgenciaO,
                           String numContaD,String numAgenciaD,double valor){
        Conta contaO = null;
        Conta contaD = null;

        for(Conta c : this.contas){
            if(c.getNumeroConta().equalsIgnoreCase(numContaO) && c.getNumeroAgencia().equalsIgnoreCase(numAgenciaO)){
                contaO = c;
            }
            if(c.getNumeroConta().equalsIgnoreCase(numContaD) && c.getNumeroAgencia().equalsIgnoreCase(numAgenciaD)){
                contaD = c;
            }
        }
        if(contaO != null && contaD != null){
            contaO.debitar(valor);
            contaD.creditar(valor);
        }
    }
    public List<Conta> pesquisarContasDoCliente(String cpfCliente){
        List<Conta> contasPesq = new ArrayList<>();
        for(Conta c : this.contas){
            if(c.getCpfTitular().equalsIgnoreCase(cpfCliente)){
                contasPesq.add(c);
            }
        }return contasPesq;
    }
    public double consultarSaldoDisponivelDeConta(String numConta,String numAgencia){
        for(Conta c : this.contas){
            if(c.getNumeroConta().equalsIgnoreCase(numConta) && c.getNumeroAgencia().equalsIgnoreCase(numAgencia)){
                return c.getSaldoDisponivel();
            }
        }return 0.0;
    }
    public double consultarSaldoDeConta(String numConta,String numAgencia){
        for(Conta c : this.contas){
            if(c.getNumeroConta().equalsIgnoreCase(numConta) && c.getNumeroAgencia().equalsIgnoreCase(numAgencia)){
                return c.getSaldo();
            }
        }return  0.0;
    }
    public boolean sacarDeConta(String numConta,String numAgencia,double valor){
        for(Conta c : this.contas){
            if(c.getNumeroConta().equalsIgnoreCase(numConta) && c.getNumeroAgencia().equalsIgnoreCase(numAgencia)){
                c.debitar(valor);
                return true;
            }
        }return false;
    }
    public boolean depositarEmConta(String numConta,String numAgencia,double valor){
        for(Conta c : this.contas){
            if(c.getNumeroConta().equalsIgnoreCase(numConta) && c.getNumeroAgencia().equalsIgnoreCase(numAgencia)){
                c.creditar(valor);
                return true;
            }
        }return false;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
