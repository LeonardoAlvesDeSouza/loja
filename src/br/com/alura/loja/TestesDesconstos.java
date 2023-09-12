package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

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
