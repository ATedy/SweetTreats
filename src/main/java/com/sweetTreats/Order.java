package com.sweetTreats;

public class Order {
    private int orderHour;
    private double customerDistance;
    private boolean IsRefrigerated;

    public Order(int orderHour, double customerDistance, boolean isRefrigerated) {
        this.orderHour = orderHour;
        this.customerDistance = customerDistance;
        IsRefrigerated = isRefrigerated;
    }

    public int getOrderHour() {
        return orderHour;
    }

    public double getCustomerDistance() {
        return customerDistance;
    }

    public boolean isRefrigerated() {
        return IsRefrigerated;
    }
}
