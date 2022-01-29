package io.github.developerheart.patterns.chainofresponsabilities.solution;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public class Main {
    // chain of respo nsability
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("500"), 10);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("232"), 32);
        Desconto desconto  = new Desconto5Itens(new Desconto500Valor(new SemDesconto()));
        System.out.println(desconto.efetuarCalculo(orcamento1));
        System.out.println(desconto.efetuarCalculo(orcamento2));

    }
}
