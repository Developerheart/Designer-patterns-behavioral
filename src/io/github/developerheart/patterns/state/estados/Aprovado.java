package io.github.developerheart.patterns.state.estados;

import io.github.developerheart.patterns.state.DomainException;
import io.github.developerheart.patterns.state.EstadoOrcamento;
import io.github.developerheart.patterns.state.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends EstadoOrcamento {

    public BigDecimal descontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoOrcamento(new Finalizado());
    }
}
