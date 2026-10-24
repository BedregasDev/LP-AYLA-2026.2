package br.ufpb.dcx.bedregal.daniel.programaLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo,String autor,int anoPublicacao,boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }
    public Livro(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 2000;
        this.disponivel = true;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public boolean getDisponivel(){
        return this.disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    public String toString() {
        return "Livro: " + this.titulo + ", autor: " + this.autor + ", ano: " +
                this.anoPublicacao + ", disponível: " + this.disponivel;
    }
}
