package br.com.loja.orcamento;

import java.util.Map;

import br.com.loja.DomainException;
import br.com.loja.http.HttpAdapter;

public class RegistroOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado nao pode ser registrado!");
        }

        String urlApi = "http://api.xyz/orcamento";
        /* Erro aqui================================================ */
        /*Map<String, Object> dadosApi = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );*/

        //httpAdapter.post(urlApi, dadosApi);
    }

}