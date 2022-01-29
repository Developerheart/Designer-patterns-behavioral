package io.github.developerheart.entidades;

import java.math.BigDecimal;

public interface Calculos {

    default BigDecimal calcular(BigDecimal valor, BigDecimal aliquota){
        return valor.multiply(aliquota);
    }


}

