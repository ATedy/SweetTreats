package com.sweetTreats;

import java.time.LocalTime;

public class Courier {
    private String name;
    private double maxDeliveryMiles;
    private LocalTime startHour;
    private LocalTime endHour;
    private boolean hasRefrigeratedBox;
    private double chargePerMile;

    public Courier(String name, double maxDeliveryMiles, boolean hasRefrigeratedBox, double chargePerMile, int startHouInNumber, int endHourInNumber) {
        this.name = name;
        this.maxDeliveryMiles = maxDeliveryMiles;
        this.hasRefrigeratedBox = hasRefrigeratedBox;
        this.chargePerMile = chargePerMile;

        LocalTime time1 = LocalTime.of(startHouInNumber, 0);
        this.startHour = time1;

        LocalTime time2 = LocalTime.of(endHourInNumber, 0);
        this.endHour = time2;
    }

    public String getName() {
        return name;
    }

    public double getMaxDeliveryMilesMiles() {
        return maxDeliveryMiles;
    }

    public boolean hasRefrigeratedBox() {
        return hasRefrigeratedBox;
    }

    public double getChargePerMile() {
        return chargePerMile;
    }


    public LocalTime getStartHour() {
        return startHour;
    }

    public LocalTime getEndHour() {
        return endHour;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + "\n" + "Miles: "+ this.maxDeliveryMiles + "\n" + "Charge per Mile: "+ this.chargePerMile;
    }
}
