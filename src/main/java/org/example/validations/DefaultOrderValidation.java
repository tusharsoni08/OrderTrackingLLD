package org.example.validations;

public class DefaultOrderValidation implements ValidationStrategy{
    @Override
    public boolean isValid(String orderId) {
        return true;
    }
}
