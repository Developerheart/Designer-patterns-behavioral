package io.github.developerheart.entidades;

import java.math.BigDecimal;

public class Imposto implements  Calculos{

    private BigDecimal valor;

    private BigDecimal aliquota;

    public Imposto() {
    }

    public Imposto(BigDecimal valor, BigDecimal aliquota) {
        this.valor = valor;
        this.aliquota = aliquota;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getAliquota() {
        return aliquota;
    }

    public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public BigDecimal calcular(BigDecimal valor, BigDecimal aliquota) {
        return valor.multiply(aliquota);
    }
}
