package com.weather.application;

public class BadRequestException extends RuntimeException {

    public BadRequestException(final String message) {
        super(message);
    }


}
