package oop.polymorphism.overloading;

import oop.basicclass.ColorOfCar;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(ColorOfCar.BLACK, "NS"); // Use overload constructor
        System.out.println(car.getColor()); // BLACK
        car.spray("WHITE"); // Use overload method
        System.out.println(car.getColor()); // WHITE
    }
}
