package br.ufpb.dcx.bedregal.daniel.exercicio15;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaDeAtletas implements SistemaGerenciaDeAtletas {

    private List<Atleta> atletas;

    public MeuSistemaGerenciaDeAtletas() {
        this.atletas = new ArrayList<>();
    }
    public void cadastrarAtleta(String codigoAtleta, int idade, List<Telefone> telefones) {
        Atleta atleta = new Atleta(codigoAtleta, idade, telefones);
        atletas.add(atleta);
    }
    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior) {
        List<Atleta> atletasPesq = new ArrayList<>();
        for (Atleta atleta : atletas) {
            if (atleta.getIdade() >= idadeInferior && atleta.getIdade() <= idadeSuperior) {
                atletasPesq.add(atleta);
            }
        }
        return atletasPesq;
    }
    public int pesquisarMaiorIdadeDosAtletas() {
        int maior = 0;
        for (Atleta atleta : atletas) {
            if (atleta.getIdade() > maior) {
                maior = atleta.getIdade();
            }
        }
        return maior;
    }
    public boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel) {
        for(Atleta a : this.atletas){
            if(a.getCodigo().equalsIgnoreCase(codigoAtleta)){
                a.cadastraTelefone(tel);
                return true;
            }
        }return false;
    }
    public boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel){
        for(Atleta a : this.atletas){
            if(a.getCodigo().equalsIgnoreCase(codigoAtleta)){
                a.apagaTelefone(tel);
                return true;
            }
        }return false;
    }
}
