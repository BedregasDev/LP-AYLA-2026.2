package br.ufpb.dcx.bedregal.daniel.programasIniciais.introduçãoPOO;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(){
        this.nome ="Sem nome";
        this.idade = 0;
    }
    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String toString(){
        return this.nome +" tem "+this.idade+" anos.";
    }

    public boolean ehDeMaior() {
        return idade >= 18;
    }
}

