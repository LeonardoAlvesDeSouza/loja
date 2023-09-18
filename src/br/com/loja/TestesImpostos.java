package br.com.loja;

import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
        //System.out.println("Passando ICMS: " + calc.calcular(orcamento, new ICMS()));
        //System.out.println("Passando ISS: " + calc.calcular(orcamento, new ISS()));
    }
}
