package io.github.developerheart.ultils;

import io.github.developerheart.entidades.Imposto;
import io.github.developerheart.entidades.Orcamento;
import io.github.developerheart.enums.TipoImposto;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, io.github.developerheart.patterns.strategy.Imposto imposto) {
        return imposto.calcular(orcamento);
    }

    public BigDecimal resultado(Imposto imposto) {
        return imposto.calcular(imposto.getValor(), imposto.getAliquota());
    }
}
