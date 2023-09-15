package br.com.alura.loja;

import br.com.alura.loja.orcamento.pedido.GeraPedido;
import br.com.alura.loja.orcamento.pedido.GeraPedidoHandler;
import br.com.alura.loja.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Leonardo Alves";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeDeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido()
                )
        );
        handler.execute(gerador);


    }
}
