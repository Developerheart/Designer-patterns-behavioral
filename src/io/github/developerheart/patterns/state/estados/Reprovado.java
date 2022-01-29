package io.github.developerheart.patterns.state.estados;

import io.github.developerheart.patterns.state.EstadoOrcamento;
import io.github.developerheart.patterns.state.Orcamento;

public class Reprovado  extends EstadoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoOrcamento(new Finalizado());
    }
}
