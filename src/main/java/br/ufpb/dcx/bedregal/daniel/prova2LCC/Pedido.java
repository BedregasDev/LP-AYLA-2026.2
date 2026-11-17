package br.ufpb.dcx.bedregal.daniel.prova2LCC;

public class Pedido {
    private String codigo;
    private String telefoneCliente;
    private String descricao;
    private String dataHoraEntrega;
    private boolean foiEntregue;

    public Pedido(String codigo,String telefoneCliente,String descricao,
                  String dataHoraEntrega,boolean foiEntregue){
        this.codigo = codigo;
        this.telefoneCliente = telefoneCliente;
        this.descricao = descricao;
        this.dataHoraEntrega = dataHoraEntrega;
        this.foiEntregue = foiEntregue;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getTelefoneCliente(){
        return this.telefoneCliente;
    }
    public void setTelefoneCliente(String telefoneCliente){
        this.telefoneCliente = telefoneCliente;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDataHoraEntrega(){
        return this.dataHoraEntrega;
    }
    public void setDataHoraEntrega(String dataHoraEntrega){
        this.dataHoraEntrega = dataHoraEntrega;
    }
    public boolean foiEntregue(){
        return this.foiEntregue;
    }
    public void setFoiEntregue(boolean foiEntregue){
        this.foiEntregue = foiEntregue;
    }
    public String toString(){
        return "Pedido de código "+ this.codigo + ": "+ this.descricao + " para "
                + this.dataHoraEntrega;
    }
}
