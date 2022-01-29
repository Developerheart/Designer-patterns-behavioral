package io.github.developerheart.patterns.chainofresponsabilities;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontos {

    // without pattern
    public BigDecimal  calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() > 5 || (orcamento.getValor().compareTo(new BigDecimal("500")) > 0))
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        return BigDecimal.ZERO;
    }

}
