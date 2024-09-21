package org.example.orderstates;

import org.example.OrderTrackingService;
import org.example.exceptions.InvalidOrderEvent;

public class OrderDelivered implements States {
    OrderTrackingService orderTrackingService;

    public OrderDelivered(OrderTrackingService orderTrackingService) {
        this.orderTrackingService = orderTrackingService;
    }

    @Override
    public void packed(String orderId) {
        throw new InvalidOrderEvent("Order is already delivered for order Id: " + orderId);
    }

    @Override
    public void pickedUp(String orderId) {
        throw new InvalidOrderEvent("Order is already delivered for order Id: " + orderId);
    }

    @Override
    public void shipped(String orderId) {
        throw new InvalidOrderEvent("Order is already delivered for order Id: " + orderId);
    }

    @Override
    public void inTransit(String orderId) {
        throw new InvalidOrderEvent("Order is already delivered for order Id: " + orderId);
    }

    @Override
    public void delivered(String orderId) {
        throw new InvalidOrderEvent("Order is already delivered for order Id: " + orderId);
    }
}
