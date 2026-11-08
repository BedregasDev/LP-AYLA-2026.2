package br.ufpb.dcx.bedregal.daniel.exercicio11;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList implements TiturecoInterface {

    private List<AtrativoTuristico> atrativos;

    public TiturecoList() {
        this.atrativos = new ArrayList<>();
    }

    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
        for (AtrativoTuristico a : this.atrativos) {
            if (a.equals(atrativo)) {
                return false; // achou um igual, não cadastra
            }
        }
        this.atrativos.add(atrativo);
        return true;
    }

    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
        for (AtrativoTuristico a : this.atrativos) {
            if (nomeAtrativo.equalsIgnoreCase(a.getNome())
                    && cidade.equalsIgnoreCase(a.getCidade())
                    && estado.equalsIgnoreCase(a.getEstado())) {
                this.atrativos.remove(a);
                return true;
            }
        }
        return false;
    }

    public List<AtrativoTuristico> getAtrativos() {
        return new ArrayList<>(this.atrativos); // cópia: protege a lista interna
    }

    public List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado) {
        List<AtrativoTuristico> resultado = new ArrayList<>();
        for (AtrativoTuristico a : this.atrativos) {
            if (cidade.equalsIgnoreCase(a.getCidade())
                    && estado.equalsIgnoreCase(a.getEstado())) {
                resultado.add(a);
            }
        }
        return resultado;
    }
}