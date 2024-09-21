package org.example.orderstates;

import org.example.OrderTrackingService;
import org.example.exceptions.InvalidOrderEvent;
import org.example.exceptions.OrderValidationException;
import org.example.validations.OrderPickedUpValidation;
import org.example.validations.ValidateOrder;

public class OrderPickedUp implements States {
    OrderTrackingService orderTrackingService;
    ValidateOrder validateOrder;

    public OrderPickedUp(OrderTrackingService orderTrackingService) {
        this.orderTrackingService = orderTrackingService;
        this.validateOrder = new ValidateOrder(new OrderPickedUpValidation());
    }

    @Override
    public void packed(String orderId) {
        throw new InvalidOrderEvent("Order cannot be packed for order Id: " + orderId);
    }

    @Override
    public void pickedUp(String orderId) {
        throw new InvalidOrderEvent("Order cannot be picked for order Id: " + orderId);
    }

    @Override
    public void shipped(String orderId) {
        if(!validateOrder.validate(orderId)) {
            throw new OrderValidationException("Order validation failed for order Id: " + orderId);
        }
        System.out.println("Order is shipped for order Id: " + orderId);
        orderTrackingService.setCurrentState(orderTrackingService.getOrderShipped(), orderId);
    }

    @Override
    public void inTransit(String orderId) {
        throw new InvalidOrderEvent("Order cannot be in-transit for order Id: " + orderId);
    }

    @Override
    public void delivered(String orderId) {
        throw new InvalidOrderEvent("Order cannot be delivered for order Id: " + orderId);
    }
}
