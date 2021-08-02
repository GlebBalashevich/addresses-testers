package com.balashevich.address.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LobException extends RuntimeException {

    private final HttpStatus httpStatus;

    private final String errorCode;

    public LobException(String message, HttpStatus httpStatus, String errorCode) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
    }
}
