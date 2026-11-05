package br.ufpb.dcx.bedregal.daniel.exercicio8.parte2;
import java.util.ArrayList;

public class CaixaDeSom {
    private ArrayList<EmissorDeSom> emissores = new ArrayList<EmissorDeSom>();

    public void adicionarEmissores(EmissorDeSom e){
        this.emissores.add(e);
    }
    public ArrayList<EmissorDeSom> getEmissores(){
        return this.emissores;
    }
    public void tocarTodosOsEmissores(){
        for(EmissorDeSom e : emissores){
            System.out.println(e.emitirSom());
        }
    }
}
