package br.ufpb.dcx.bedregal.daniel.exercicio8.parte1;

public class Circulo implements Figura {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    public Circulo(){
        this.raio = 0.0;
    }
    public double calcularArea(){
        return Math.PI * this.raio * this.raio;
    }
    public double getRaio(){
        return this.raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public String toString(){
        return "Círculo de raio "+this.raio+" com área: "+this.calcularArea();
    }
}
