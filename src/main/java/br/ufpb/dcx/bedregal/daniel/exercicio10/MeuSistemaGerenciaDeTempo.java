package br.ufpb.dcx.bedregal.daniel.exercicio10;
import java.util.List;
import java.util.ArrayList;

public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo{
    private List<Tarefa> tarefas;

    public MeuSistemaGerenciaDeTempo(){
        this.tarefas = new ArrayList<Tarefa>();
    }
    public void cadastrarTarefa(String descricao,String categoria,int tempoEmMinutos){
        Tarefa tarefa = new Tarefa(descricao,categoria,tempoEmMinutos);
        tarefas.add(tarefa);
    }
    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria){
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for(Tarefa tarefa : tarefas){
            if(tarefa.getCategoria().equals(categoria)){
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }
    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos){
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for(Tarefa tarefa : tarefas){
            if(tarefa.getTempoTarefaEmMinutos()> tempoEmMinutos){
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa){
        int tempoTotalDeTarefasDaCategoria = 0;
        for(Tarefa tarefa : tarefas){
            if(tarefa.getCategoria().equalsIgnoreCase(categoriaTarefa)){
                tempoTotalDeTarefasDaCategoria += tarefa.getTempoTarefaEmMinutos();
            }
        }
        return tempoTotalDeTarefasDaCategoria;
    }
    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa){
        int tempoTotal = 0;
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricaoTarefa)){
                tempoTotal += tarefa.getTempoTarefaEmMinutos();
            }
        }
        return tempoTotal;
    }
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao){
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }
}
