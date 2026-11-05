package br.ufpb.dcx.bedregal.daniel.exercicio8.parte2;

public class TestaCaixaDeSom {

    public static void main(String[] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissores(new Cachorro("Bob"));
        caixa.adicionarEmissores(new Tambor("P", "Giannini"));
        caixa.adicionarEmissores(new Cachorro("Rex"));
        caixa.adicionarEmissores(new Tambor("G", "Pearl"));
        caixa.adicionarEmissores(new Cachorro("Mel"));
        caixa.tocarTodosOsEmissores();
    }
}