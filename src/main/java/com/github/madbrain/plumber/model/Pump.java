package com.github.madbrain.plumber.model;

public class Pump extends NetworkElementBase {

    private double power;
    private double pressure;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
