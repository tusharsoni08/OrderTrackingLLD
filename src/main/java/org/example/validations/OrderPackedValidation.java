package org.example.validations;

public class OrderPackedValidation implements ValidationStrategy {
    @Override
    public boolean isValid(String orderId) {
        return true;
    }
}
