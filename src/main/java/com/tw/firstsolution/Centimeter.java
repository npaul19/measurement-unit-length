package com.tw.firstsolution;

public class Centimeter {

    private final double magnitude;

    public Centimeter(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Meter) {
            Meter that = (Meter) obj;
            return magnitude == that.getMagnitude() * Meter.CENTIMETER_T0_METER_CONVERSION_FACTOR;
        }
        if (obj.getClass() == getClass()) {
            Centimeter that = (Centimeter) obj;
            return magnitude == that.magnitude;
        }
        return false;
    }
}
