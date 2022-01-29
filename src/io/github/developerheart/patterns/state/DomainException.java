package io.github.developerheart.patterns.state;

public class DomainException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public DomainException(String mensagem) {
        super(mensagem);
    }
}
