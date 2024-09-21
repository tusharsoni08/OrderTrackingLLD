package org.example.exceptions;

public class InvalidOrderEvent extends RuntimeException {
    public InvalidOrderEvent(String message) {
        super(message);
    }
}
