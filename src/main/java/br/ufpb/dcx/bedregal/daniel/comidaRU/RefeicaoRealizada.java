package br.ufpb.dcx.bedregal.daniel.comidaRU;

public class RefeicaoRealizada {
    private String matricula;
    private String tipoRefeicao;

    public RefeicaoRealizada(String matricula,String tipoRefeicao){
        this.matricula = matricula;
        this.tipoRefeicao = tipoRefeicao;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getTipoRefeicao(){
        return this.tipoRefeicao;
    }
    public void setTipoRefeicao(String tipoRefeicao){
        this.tipoRefeicao = tipoRefeicao;
    }
    public String toString(){
        return "O aluno com a matrícula "+this.matricula
                +" realizou a refeição do tipo "+ this.tipoRefeicao+".";
    }
}
