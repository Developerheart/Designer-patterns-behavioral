package io.github.developerheart.patterns.chainofresponsabilities.solution;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public class Desconto5Itens extends Desconto {

    public Desconto5Itens(Desconto desconto) {
        super(desconto);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.10"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 10;
    }
}
