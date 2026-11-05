package br.ufpb.dcx.bedregal.daniel.exercicio8.parte1;

public class Triangulo implements Figura {
    private double base;
    private double altura;

    public Triangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(){
        this.base = 0.0;
        this.altura = 0.0;
    }
    public double calcularArea(){
        return this.base * this.altura /2;
    }

    public double getAltura() {
        return this.altura;
    }
    public double getBase(){
        return this.base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }
}

