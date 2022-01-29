package io.github.developerheart.patterns.chainofresponsabilities.solution;

import io.github.developerheart.entidades.Orcamento;

import java.math.BigDecimal;

public class Desconto5Itens extends Desconto{

    public Desconto5Itens(Desconto desconto) {
        super(desconto);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() > 0)
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        return desconto.calcular(orcamento);
    }
}
