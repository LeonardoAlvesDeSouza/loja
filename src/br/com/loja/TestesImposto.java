package br.com.loja;

import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
    }
}
