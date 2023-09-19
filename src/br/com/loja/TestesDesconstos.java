package br.com.loja;

import br.com.loja.descontos.CalculadoraDeDescontos;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconstos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("1500")));

        Orcamento orcamento3 = new Orcamento();
        orcamento3.adicionarItem(new ItemOrcamento(new BigDecimal("50")));

        CalculadoraDeDescontos desconto = new CalculadoraDeDescontos();
        System.out.println("Passando o DESCONTO do primeiro orçamento: " + desconto.calcular(orcamento1));
        System.out.println("Passando o DESCONTO do segundo orçamento: " + desconto.calcular(orcamento2));
        System.out.println("Passando o DESCONTO do terceiro orçamento: " + desconto.calcular(orcamento3));
    }
}
