package br.com.loja.orcamento.pedido;

import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.pedido.acao.AcaoAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoesAposGerarPedido;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedido) {
        this.acoesAposGerarPedido = acoesAposGerarPedido;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));

    }
}
