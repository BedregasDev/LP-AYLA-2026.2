package br.ufpb.dcx.bedregal.daniel.exercicio8.parte1;

public class Quadrado implements Figura {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    public Quadrado(){
        this.lado = 0.0;
    }
    public double calcularArea(){
        return this.lado * this.lado;
    }
    public double getLado(){
        return this.lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public String toString(){
        return "Quadrado de lado "+this.lado+" de área: "+this.calcularArea();
    }
}
