package com.tw.firstsolution;

public class Meter {
    private final double magnitude;
    public static final double CENTIMETER_T0_METER_CONVERSION_FACTOR = 100;

    public Meter(double magnitude) {
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
        if (obj.getClass() != getClass()) {
            return false;
        }
        Meter that = (Meter) obj;
        return magnitude == that.magnitude;
    }
}
