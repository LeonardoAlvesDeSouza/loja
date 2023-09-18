package br.com.loja.orcamento.pedido.acao;

import br.com.loja.orcamento.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido");
        //informar os dados
    }

}
