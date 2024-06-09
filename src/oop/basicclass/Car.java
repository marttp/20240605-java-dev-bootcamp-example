package oop.basicclass;

public class Car {
    private ColorOfCar color;
    private String brand;
    private int tires;

    public Car() {
        // Return the reserved memory address of the instance
    }

    public ColorOfCar getColor() {
        return this.color;
    }

    public void spray(ColorOfCar color) {
        this.color = color;
    }
}
