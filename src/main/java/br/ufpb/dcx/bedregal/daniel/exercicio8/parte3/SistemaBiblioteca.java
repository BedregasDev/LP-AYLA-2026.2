package br.ufpb.dcx.bedregal.daniel.exercicio8.parte3;

import java.util.ArrayList;

public interface SistemaBiblioteca {
    public void adicionarLivro(Livro livro);
    public boolean removerLivro(String titulo);
    public Livro pesquisarLivro(String titulo);
    public ArrayList<Livro> getLivros();
}