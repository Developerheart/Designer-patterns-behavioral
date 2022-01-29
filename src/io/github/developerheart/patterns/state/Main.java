package io.github.developerheart.patterns.state;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Orcamento orcamento =  new Orcamento(new BigDecimal("1030"), 20);
        System.out.println(orcamento.getValor());
        orcamento.aplicarDescontoExtra();
        System.out.println(orcamento.getValor());

        orcamento.aprovar();
        System.out.println("SEM DESCONTO (ESTADO APROVADO) " + orcamento.getValor());
        orcamento.aplicarDescontoExtra();
        System.out.println("COM DESCONTO (ESTADO APROVADO) " + orcamento.getValor());


    }
}
