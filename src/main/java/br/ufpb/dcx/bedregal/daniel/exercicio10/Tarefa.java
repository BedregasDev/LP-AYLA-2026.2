package br.ufpb.dcx.bedregal.daniel.exercicio10;

public class Tarefa {
    private String descricao;
    private String categoria;
    private int tempoTarefaEmMinutos;

    public Tarefa(String descricao,String categoria,int tempoTarefaEmMinutos){
        this.descricao = descricao;
        this.categoria = categoria;
        this.tempoTarefaEmMinutos = tempoTarefaEmMinutos;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public int getTempoTarefaEmMinutos(){
        return this.tempoTarefaEmMinutos;
    }
    public void setTempoTarefaEmMinutos(int tempoTarefaEmMinutos){
        this.tempoTarefaEmMinutos = tempoTarefaEmMinutos;
    }
    public String toString(){
        return "Tarefa "+this.descricao+" com duração de "+this.tempoTarefaEmMinutos;
    }
}
