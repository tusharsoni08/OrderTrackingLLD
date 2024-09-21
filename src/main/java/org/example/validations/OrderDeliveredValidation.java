package org.example.validations;

public class OrderDeliveredValidation implements ValidationStrategy {
    @Override
    public boolean isValid(String orderId) {
        return true;
    }
}
