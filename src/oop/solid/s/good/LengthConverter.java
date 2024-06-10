package oop.solid.s.good;

public class LengthConverter {

    private static final double METER_TO_FEET = 3.28084;

    public double meterToFeet(int length) {
        return length * METER_TO_FEET;
    }
}
