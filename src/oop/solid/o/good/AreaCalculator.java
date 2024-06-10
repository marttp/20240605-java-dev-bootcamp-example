package oop.solid.o.good;

import java.util.List;

public class AreaCalculator {

    private final List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double sumArea() {
        // Sum from area formula depending on shape
        double sum = 0;
        for (var shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}
