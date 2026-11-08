package br.ufpb.dcx.bedregal.daniel.exercicio11;

import java.util.List;

public interface TiturecoInterface {
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo);
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado);
    public List<AtrativoTuristico> getAtrativos();
    public List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado);
}