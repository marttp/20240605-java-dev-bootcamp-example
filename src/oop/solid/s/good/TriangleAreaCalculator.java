package oop.solid.s.good;

public class TriangleAreaCalculator {

    private static final double TRIANGLE_CONSTANT = 0.5;

    private final int base;
    private final int height;

    public TriangleAreaCalculator(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return TRIANGLE_CONSTANT * this.base * this.height;
    }
}
