package com.mariana.excecoes;

public class LivroIndisponivelException extends RuntimeException {
    public LivroIndisponivelException(String message) {
        super(message);
    }
}
