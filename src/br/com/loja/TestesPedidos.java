package br.com.loja;

import br.com.loja.orcamento.pedido.GeraPedido;
import br.com.loja.orcamento.pedido.GeraPedidoHandler;
import br.com.loja.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.loja.orcamento.pedido.acao.LogDePedido;
import br.com.loja.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Leonardo Alves";
        BigDecimal valorOrcamento = new BigDecimal("745.99");
        int quantidadeDeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido(),
                        new LogDePedido()
                )
        );

        handler.execute(gerador);

    }
}
