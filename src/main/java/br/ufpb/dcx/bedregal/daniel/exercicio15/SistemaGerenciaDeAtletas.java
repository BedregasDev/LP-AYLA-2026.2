package br.ufpb.dcx.bedregal.daniel.exercicio15;

import java.util.List;

public interface SistemaGerenciaDeAtletas {

    void cadastrarAtleta(String codigoAtleta, int idade, List<Telefone> telefones);

    List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior);

    int pesquisarMaiorIdadeDosAtletas();

    boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel);

    boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel);
}
