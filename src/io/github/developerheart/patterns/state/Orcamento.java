package io.github.developerheart.patterns.state;

import io.github.developerheart.patterns.state.estados.EmAnalise;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidade;
    private EstadoOrcamento estadoOrcamento;

    public Orcamento(BigDecimal valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
        this.setEstadoOrcamento(new EmAnalise());
    }

    public void aplicarDescontoExtra(){
        BigDecimal descontoExtra = estadoOrcamento.descontoExtra(this);
        this.valor = this.valor.subtract(descontoExtra);
    }


    public void aprovar(){
        estadoOrcamento.aprovar(this);
    }

    public void reprovar(){
        estadoOrcamento.reprovar(this);
    }

    public void finalizar(){
        estadoOrcamento.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public EstadoOrcamento getEstadoOrcamento() {
        return estadoOrcamento;
    }

    public void setEstadoOrcamento(EstadoOrcamento estadoOrcamento) {
        this.estadoOrcamento = estadoOrcamento;
    }
}
