package br.ufpb.dcx.bedregal.daniel.exercicio8.parte3;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getAno() {
        return this.ano;
    }

    public String toString() {
        return this.titulo + " - " + this.autor + " (" + this.ano + ")";
    }
}