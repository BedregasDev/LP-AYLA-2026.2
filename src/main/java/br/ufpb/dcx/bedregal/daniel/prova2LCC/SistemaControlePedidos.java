package br.ufpb.dcx.bedregal.daniel.prova2LCC;
import java.util.List;

public interface SistemaControlePedidos {
    public void cadastrarPedido(String codigo, String telefoneCliente, String descricao,
                                String dataHoraEntrega, boolean foiEntregue);
    public List<Pedido> pesquisarPedidosDoCliente(String telefoneCliente);
    public List<Pedido> pesquisarPedidosNaoEntregues();
    public List<Pedido> pesquisarPedidosParaHorario(String dataHoraEntrega);
    public boolean pesquisarSePedidoFoiEntregue(String codigoPedido);
    public int pesquisarQuantidadeDePedidosDoCliente(String telefoneCliente);
}

