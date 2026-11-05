package br.ufpb.dcx.bedregal.daniel.exercicio8.parte2;

public class Tambor implements EmissorDeSom{
    private String tamanho;
    private String marca;

    public Tambor(String tamanho, String marca){
        this.tamanho = tamanho;
        this.marca = marca;
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public String getMarca(){
        return this.marca;
    }
    public String emitirSom(){
        return "PUM-PUM";
    }

}
