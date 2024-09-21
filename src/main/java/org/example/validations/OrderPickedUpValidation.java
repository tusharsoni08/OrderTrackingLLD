package org.example.validations;

public class OrderPickedUpValidation implements ValidationStrategy {
    @Override
    public boolean isValid(String orderId) {
        return true;
    }
}
