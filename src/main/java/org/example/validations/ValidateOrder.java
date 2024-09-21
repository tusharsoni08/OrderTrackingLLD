package org.example.validations;

import lombok.Setter;

@Setter
public class ValidateOrder {
    ValidationStrategy validationStrategy;

    public ValidateOrder(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String orderId) {
        return validationStrategy.isValid(orderId);
    }

}
