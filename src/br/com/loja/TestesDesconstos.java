package br.com.loja;

import br.com.loja.descontos.CalculadoraDeDescontos;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconstos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("500"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("2500"), 4);
        CalculadoraDeDescontos desc = new CalculadoraDeDescontos();
        System.out.println("Passando o DESCONTO do primeiro orçamento: " + desc.calcular(orcamento1));
        System.out.println("Passando o DESCONTO do segundo orçamento: " + desc.calcular(orcamento2));
    }
}
