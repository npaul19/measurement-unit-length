package com.tw.firstsolution;

public class Centimeter {

    private final double magnitude;

    public Centimeter(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Centimeter that = (Centimeter) obj;
        return magnitude == that.magnitude;
    }
}
