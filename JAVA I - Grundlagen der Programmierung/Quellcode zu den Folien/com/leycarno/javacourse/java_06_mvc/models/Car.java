package com.leycarno.javacourse.java_06_mvc.models;

public class Car {

    private String type;
    private float fuelMax;
    private float fuel;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getFuelMax() {
        return fuelMax;
    }

    public void setFuelMax(float fuelMax) {
        this.fuelMax = fuelMax;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }
}
