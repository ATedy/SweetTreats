package com.sweetTreats;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Order {
    private LocalTime orderHour;
    private double customerDistance;
    private boolean IsRefrigerated;

    public Order(String orderHour, double customerDistance, boolean isRefrigerated) {
//        LocalTime time = LocalTime.of(orderHour, 0);
        this.orderHour = LocalTime.parse(orderHour, DateTimeFormatter.ISO_LOCAL_TIME);
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
