package org.example.validations;

public class OrderInTransitValidation implements ValidationStrategy {
    @Override
    public boolean isValid(String orderId) {
        return true;
    }
}
