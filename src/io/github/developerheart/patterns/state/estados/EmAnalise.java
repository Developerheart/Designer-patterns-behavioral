package io.github.developerheart.patterns.state.estados;

import io.github.developerheart.patterns.state.EstadoOrcamento;
import io.github.developerheart.patterns.state.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends EstadoOrcamento {

    public void aprovar(Orcamento orcamento){
        orcamento.setEstadoOrcamento(new Aprovado());
    }
    public void reprovar(Orcamento orcamento){
        orcamento.setEstadoOrcamento(new Reprovado());
    }
}
