package br.ufpb.dcx.bedregal.daniel.agenda;

public class Contato {
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Contato(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Contato() {
        this("", "", new Endereco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Contato de nome " + this.nome + ", telefone " + this.telefone
                + " e " + this.endereco.toString();
    }
}