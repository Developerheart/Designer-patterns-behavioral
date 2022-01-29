package io.github.developerheart.patterns.command;

import io.github.developerheart.patterns.state.Orcamento;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {

    private String nomeCliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String nomeCliente, LocalDateTime data, Orcamento orcamento) {
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
}
