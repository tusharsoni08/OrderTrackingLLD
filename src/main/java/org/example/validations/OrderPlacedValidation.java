package org.example.validations;

public class OrderPlacedValidation implements ValidationStrategy {

    @Override
    public boolean isValid(String orderId) {
        return true;
    }
}
