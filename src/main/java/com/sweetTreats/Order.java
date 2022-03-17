package com.sweetTreats;

import java.time.LocalTime;

public class Order {
    private LocalTime orderHour;
    private double customerDistance;
    private boolean IsRefrigerated;

    public Order(int orderHour, double customerDistance, boolean isRefrigerated) {
        LocalTime time = LocalTime.of(orderHour, 0);
        this.orderHour = time;
        this.customerDistance = customerDistance;
        IsRefrigerated = isRefrigerated;
    }

    public LocalTime getOrderHour() {
        return orderHour;
    }

    public double getCustomerDistance() {
        return customerDistance;
    }

    public boolean isRefrigerated() {
        return IsRefrigerated;
    }
}
