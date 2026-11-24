package br.ufpb.dcx.bedregal.daniel.exercicio15;

public class Telefone {

    private String DDD;
    private String numero;
    private String tipo;

    public Telefone(String DDD, String numero, String tipo) {
        this.DDD = DDD;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "(" + DDD + ") " + numero + " - " + tipo;
    }
}