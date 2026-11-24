package br.ufpb.dcx.bedregal.daniel.exercicio15;

import java.util.List;

public interface SistemaGerenciaDeAtletas {

    public void cadastrarAtleta(String codigoAtleta, int idade, List<Telefone> telefones) throws AtletaJaExisteException;

    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior);

    public int pesquisarMaiorIdadeDosAtletas();

    public boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel);

    public boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel);
}
