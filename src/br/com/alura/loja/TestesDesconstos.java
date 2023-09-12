package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
        CalculadoraDeDescontos desc= new CalculadoraDeDescontos();
        System.out.println("Passando ICMS: " + calc.calcular(orcamento, new ICMS()));
        System.out.println("Passando ISS: " + calc.calcular(orcamento, new ISS()));
        System.out.println("Passando o DESCONTO: " + desc.calcular(orcamento));
    }
}
