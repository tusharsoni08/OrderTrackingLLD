package org.example;
import org.example.orderstates.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderTrackingService {
    private Map<String, States> currentStateOfOrderMap;
    private AtomicInteger atomicInteger = new AtomicInteger(1);
    private static OrderTrackingService instance;

    private OrderTrackingService() {
        this.currentStateOfOrderMap = new HashMap<>();
    }

    public static OrderTrackingService getInstance() {
        if(instance == null) {
            instance = new OrderTrackingService();
        }
        return instance;
    }

    public String createOrder() {
        String orderId = getOrderId();
        currentStateOfOrderMap.put(orderId, getOrderPlaced());
        return orderId;
    }

    public void setCurrentState(States state, String orderId) {
        currentStateOfOrderMap.put(orderId, state);
    }

    public States getCurrentStateOfOrder(String orderId) {
        return currentStateOfOrderMap.get(orderId);
    }

    public void packed(String orderId) {
        currentStateOfOrderMap.get(orderId).packed(orderId);
    }

    public void pickedUp(String orderId) {
        currentStateOfOrderMap.get(orderId).pickedUp(orderId);
    }

    public void shipped(String orderId) {
        currentStateOfOrderMap.get(orderId).shipped(orderId);
    }

    public void inTransit(String orderId) {
        currentStateOfOrderMap.get(orderId).inTransit(orderId);
    }

    public void delivered(String orderId) {
        currentStateOfOrderMap.get(orderId).delivered(orderId);
    }

    private String getOrderId() {
        return "Order-" + atomicInteger.getAndIncrement();
    }

    public States getOrderPlaced() {
        return new OrderPlaced(this);
    }

    public States getOrderPacked() {
        return new OrderPacked(this);
    }

    public States getOrderPickedUp() {
        return new OrderPickedUp(this);
    }

    public States getOrderShipped() {
        return new OrderShipped(this);
    }

    public States getOrderInTransit() {
        return new OrderInTransit(this);
    }

    public States getOrderDelivered() {
        return new OrderDelivered(this);
    }
}
