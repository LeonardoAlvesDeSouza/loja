package br.com.loja;

import br.com.loja.http.JavaHttpClient;
import br.com.loja.orcamento.Orcamento;


import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();

        //RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        //registro.registrar(orcamento);
    }
}
