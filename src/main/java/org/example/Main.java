package org.example;


public class Main {
    public static void main(String[] args) {
        OrderTrackingService orderTrackingService = OrderTrackingService.getInstance();
        String order1 = orderTrackingService.createOrder();
        String order2 = orderTrackingService.createOrder();

        orderTrackingService.packed(order1);
        orderTrackingService.pickedUp(order1);
        orderTrackingService.shipped(order1);
        orderTrackingService.inTransit(order1);
        orderTrackingService.delivered(order1);

        orderTrackingService.packed(order2);
        orderTrackingService.pickedUp(order2);
        orderTrackingService.shipped(order2);
        orderTrackingService.inTransit(order2);
        orderTrackingService.delivered(order2);
    }
}

/*

ShipmentStates
Events







 */