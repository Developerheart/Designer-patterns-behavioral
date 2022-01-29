package io.github.developerheart.patterns.chainofresponsabilities.solution;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public class Desconto500Valor extends Desconto {

    public Desconto500Valor(Desconto desconto) {
        super(desconto);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("400")) > 0;
    }
}
