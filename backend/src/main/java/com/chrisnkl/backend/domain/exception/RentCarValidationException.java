package com.chrisnkl.backend.domain.exception;

import lombok.Getter;

@Getter
public class RentCarValidationException extends RuntimeException {

    public RentCarValidationException() {
        super();
    }

    public RentCarValidationException(String message) {
        super(message);
    }

    public RentCarValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    protected RentCarValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public RentCarValidationException(Throwable cause) {
        super(cause);
    }
}
