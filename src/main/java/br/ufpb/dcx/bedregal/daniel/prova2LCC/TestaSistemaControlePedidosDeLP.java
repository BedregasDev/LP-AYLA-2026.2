package br.ufpb.dcx.bedregal.daniel.prova2LCC;

import java.util.List;

public class TestaSistemaControlePedidosDeLP {
    public static void main(String[] args) {
        SistemaControlePedidos sistema = new SistemaControlePedidosDeLP();
        sistema.cadastrarPedido("X111", "(83)97777-7777", "30 coxinhas e 100 brigadeiros",
                "10/11/2026-08:00", false );
        sistema.cadastrarPedido("X100", "(83)99999-0000", "100 pastéis de forno de queijo",
                "08/11/2026-18:00", true );
        System.out.println(sistema.pesquisarQuantidadeDePedidosDoCliente("(83)95555-5555"));
        List<Pedido> pedidosDoCliente2 = sistema.pesquisarPedidosDoCliente("(83)99999-0000");
        for (Pedido p : pedidosDoCliente2) {
            System.out.println(p.toString());
        }
        //TODO: completar a partir daqui
    }
}
