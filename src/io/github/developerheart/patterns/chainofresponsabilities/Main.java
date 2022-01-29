package io.github.developerheart.patterns.chainofresponsabilities;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("600"), 4);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("600"), 1);

        CalcularDescontos calcularDescontos = new CalcularDescontos();
        System.out.println("Total do desconto: ".concat(calcularDescontos.calcular(orcamento1).toPlainString()));

        System.out.println("-------------------------");

//        System.out.println(new Desconto5Itens().calcular(orcamento1));
//        System.out.println(new Desconto500Valor().calcular(orcamento2));

    }

}
