package com.sweetTreats;

public class Courier {
    private String name;
    private double miles;
    private boolean hasRefrigeratedBox;
    private double chargePerMile;

    public Courier(String name, double miles, boolean hasRefrigeratedBox, double chargePerMile) {
        this.name = name;
        this.miles = miles;
        this.hasRefrigeratedBox = hasRefrigeratedBox;
        this.chargePerMile = chargePerMile;
    }

    public String getName() {
        return name;
    }

    public double getMiles() {
        return miles;
    }

    public boolean isHasRefrigeratedBox() {
        return hasRefrigeratedBox;
    }

    public double getChargePerMile() {
        return chargePerMile;
    }

    @Override
    public String toString() {
        return this.name + "" + this.miles + "" + this.chargePerMile;
    }
}
