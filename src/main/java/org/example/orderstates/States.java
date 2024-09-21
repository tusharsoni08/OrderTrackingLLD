package org.example.orderstates;

public interface States {
    void packed(String orderId);
    void pickedUp(String orderId);
    void shipped(String orderId);
    void inTransit(String orderId);
    void delivered(String orderId);
}


