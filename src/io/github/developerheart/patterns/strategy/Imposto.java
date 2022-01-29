package io.github.developerheart.patterns.strategy;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);


}
