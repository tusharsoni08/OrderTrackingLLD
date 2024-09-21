package org.example.validations;

public class OrderShippedValidation implements ValidationStrategy {
    @Override
    public boolean isValid(String orderId) {
        return true;
    }
}
