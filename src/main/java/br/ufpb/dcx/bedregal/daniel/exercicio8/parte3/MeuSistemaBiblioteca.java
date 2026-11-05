package br.ufpb.dcx.bedregal.daniel.exercicio8.parte3;
import java.util.ArrayList;

public class MeuSistemaBiblioteca implements SistemaBiblioteca {

    private ArrayList<Livro> livros;

    public MeuSistemaBiblioteca() {
        this.livros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    public Livro pesquisarLivro(String titulo) {
        for (Livro l : this.livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
    public boolean removerLivro(String titulo) {
        Livro l = this.pesquisarLivro(titulo);
        if (l != null) {
            this.livros.remove(l);
            return true;
        }
        return false;
    }
    public ArrayList<Livro> getLivros() {
        return this.livros;
    }
}

