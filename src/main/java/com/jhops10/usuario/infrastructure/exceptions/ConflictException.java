package com.jhops10.usuario.infrastructure.exceptions;

public class ConflictException extends RuntimeException {

    public ConflictException(String msg) {
        super(msg);
    }

    public ConflictException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
