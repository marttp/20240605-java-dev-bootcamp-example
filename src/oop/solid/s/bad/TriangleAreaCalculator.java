package oop.solid.s.bad;

public class TriangleAreaCalculator {

    private static final double TRIANGLE_CONSTANT = 0.5;
    private static final double METER_TO_FEET = 3.28084;

    private final int base; // assume meter
    private final int height;

    public TriangleAreaCalculator(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return TRIANGLE_CONSTANT * this.base * this.height;
    }

    // Break SRP rule
    public double meterToFeet(int length) {
        return length * METER_TO_FEET;
    }
}
