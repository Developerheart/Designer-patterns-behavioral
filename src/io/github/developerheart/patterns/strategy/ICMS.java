package io.github.developerheart.patterns.strategy;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto{

    @Override
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }


}
