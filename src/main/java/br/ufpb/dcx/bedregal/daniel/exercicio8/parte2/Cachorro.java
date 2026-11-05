package br.ufpb.dcx.bedregal.daniel.exercicio8.parte2;

public class Cachorro implements EmissorDeSom{
    private String nome;

    public Cachorro(String nome){
        this.nome = nome;
    }
    public String emitirSom(){
        return "AU-AU";
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
