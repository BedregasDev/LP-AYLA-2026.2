package br.ufpb.dcx.bedregal.daniel.prova2LCC;
import java.util.List;
import java.util.ArrayList;

public class SistemaControlePedidosDeLP implements SistemaControlePedidos{

    private List<Pedido> pedidos;

    public SistemaControlePedidosDeLP(){
        this.pedidos = new ArrayList<>();
    }
    public void cadastrarPedido(String codigo, String telefoneCliente, String descricao,
                                String dataHoraEntrega, boolean foiEntregue){
        Pedido pedido = new Pedido(codigo,telefoneCliente,descricao,dataHoraEntrega,foiEntregue);
        pedidos.add(pedido);
    }
    public List<Pedido> pesquisarPedidosDoCliente(String telefoneCliente){
        List<Pedido> pedidosPesq = new ArrayList<>();
        for(Pedido p : this.pedidos){
            if(p.getTelefoneCliente().equalsIgnoreCase(telefoneCliente)){
                pedidosPesq.add(p);
            }
        }return pedidosPesq;
    }
    public List<Pedido> pesquisarPedidosNaoEntregues(){
        List<Pedido> pedidosPesq = new ArrayList<>();
        for(Pedido p : this.pedidos){
            if(!p.foiEntregue()){
                pedidosPesq.add(p);
            }
        }return pedidosPesq;
    }
    public List<Pedido> pesquisarPedidosParaHorario(String dataHoraEntrega){
        List<Pedido> pedidosPesq = new ArrayList<>();
        for(Pedido p : this.pedidos){
            if(p.getDataHoraEntrega().equalsIgnoreCase(dataHoraEntrega)){
                pedidosPesq.add(p);
            }
        }return pedidosPesq;
    }
    public boolean pesquisarSePedidoFoiEntregue(String codigoPedido){
        for(Pedido p : this.pedidos){
            if(p.getCodigo().equalsIgnoreCase(codigoPedido)){
                return p.foiEntregue();
            }
        }return false;
    }
    public int pesquisarQuantidadeDePedidosDoCliente(String telefoneCliente){
        int contador = 0;
        for(Pedido p : this.pedidos){
            if(p.getTelefoneCliente().equalsIgnoreCase(telefoneCliente)){
                contador ++;
            }
        }return contador;
    }
}
