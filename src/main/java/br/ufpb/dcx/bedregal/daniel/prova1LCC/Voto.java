package br.ufpb.dcx.bedregal.daniel.prova1LCC;

public class Voto {
    private String codigo;
    private int numeroChapa;

    public Voto(String codigo, int numeroChapa){
        this.codigo = codigo;
        this.numeroChapa = numeroChapa;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public int getNumeroChapa(){
        return this.numeroChapa;
    }
    public void setNumeroChapa(int numeroChapa){
        this.numeroChapa = numeroChapa;
    }
    public String toString(){
        return "Codigo votante: "+this.codigo+" votou na chapa "+this.numeroChapa+".";
    }
}
