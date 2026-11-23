package br.ufpb.dcx.bedregal.daniel.exercicio12;

import java.util.List;

public interface SistemaBanco {
    public List<Conta> pesquisarContasComSaldoNegativo();
    public boolean abrirConta(Conta novaConta);
    public void transferir(String numContaO,String numAgenciaO,String numContaD,String numAgenciaD,double valor);
    public List<Conta> pesquisarContasDoCliente(String cpfCliente);
    public double consultarSaldoDisponivelDeConta(String numConta,String numAgencia);
    public double consultarSaldoDeConta(String numConta,String numAgencia);
    public boolean sacarDeConta(String numConta,String numAgencia,double valor);
    public boolean depositarEmConta(String numConta,String numAgencia,double valor);
}


