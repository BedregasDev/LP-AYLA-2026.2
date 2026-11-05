package br.ufpb.dcx.bedregal.daniel.exercicio8.parte1;

import java.util.ArrayList;

public class CalculadoraDeAreas {
    public static void main(String [] args){
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        Quadrado q1 = new Quadrado(2);
        Triangulo tri1 = new Triangulo(5,4);
        Quadrado q2 = new Quadrado(3);
        Triangulo tri2 = new Triangulo(10,2);

        figuras.add(q1);
// ou pode ser -> figuras.add(new Quadrado(2));
        figuras.add(tri1);
        figuras.add(q2);
        figuras.add(tri2);
        double areaTotal = 0;
        for(Figura f : figuras){
            double area = f.calcularArea();
            areaTotal += area;

        }
        System.out.println("A área total é: "+areaTotal);
    }
}
