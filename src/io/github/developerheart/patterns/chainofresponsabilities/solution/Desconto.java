package io.github.developerheart.patterns.chainofresponsabilities.solution;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto desconto;

    public Desconto(Desconto desconto) {
        this.desconto = desconto;
    }

    protected BigDecimal efetuarCalculo(Orcamento orcamento){
        if (deveAplicar(orcamento))
            return calcular(orcamento);
        return desconto.efetuarCalculo(orcamento);
    }
    protected abstract BigDecimal calcular(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);
}
