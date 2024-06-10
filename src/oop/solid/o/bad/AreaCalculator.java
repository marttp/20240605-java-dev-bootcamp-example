package oop.solid.o.bad;

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
            if (shape instanceof Circle c) {
                // Area of circle
                System.out.println("Area of circle");
                sum += Math.PI * Math.pow(c.getRadius(), 2.0);
            } else if (shape instanceof Rectangle r) {
                // Area of rectangle
                System.out.println("Area of rectangle");
                sum += r.getHeight() * r.getWidth();
            }
            // Oh shoot!, I need to create another condition (for Square)
            // Here where we break OCP rule
        }
        return sum;
    }
}
