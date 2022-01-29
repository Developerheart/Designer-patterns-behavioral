package io.github.developerheart.patterns.chainofresponsabilities.solution;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontos {

    public BigDecimal  calcular(Orcamento orcamento){

        Desconto desconto = new Desconto500Valor(new Desconto5Itens(new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
