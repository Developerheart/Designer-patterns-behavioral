package io.github.developerheart.patterns.chainofresponsabilities.solution;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto desconto;

    public Desconto(Desconto desconto) {
        this.desconto = desconto;
    }


    public abstract BigDecimal calcular(Orcamento orcamento);


}
