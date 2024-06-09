package oop.polymorphism.overloading;

import oop.basicclass.ColorOfCar;

public class Car {
    private ColorOfCar color;
    private String brand;
    private int tires;

    public Car() {
        // Return the reserved memory address of the instance
    }

    public Car(ColorOfCar color, String brand) {
        this(color, brand, 4);
    }

    public Car(ColorOfCar color, String brand, int tires) {
        this.color = color;
        this.brand = brand;
        this.tires = tires;
    }

    public ColorOfCar getColor() {
        return this.color;
    }

    public void spray(ColorOfCar color) {
        this.color = color;
    }

    public void spray(String color) {
        this.color = ColorOfCar.valueOf(color);
    }

    public void setColor(ColorOfCar color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }
}
