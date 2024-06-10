package oop.solid.d;

import oop.solid.d.good.Car;
import oop.solid.d.good.Engine;

public class Main {

    public static void main(String[] args) {
        /*
         * Dependency Inversion Principle (DIP)
         * Depend on abstractions, not on concretions.
         * High-level modules should not depend on low-level modules. Both should depend on abstractions.
         * */
        // Car car = new Car("TTT");
        // car.getEngine().start(); // What Engine?
        // car.start(); // Cannot control engine outside, we cannot replace engine

        // They have own lifecycle
        Engine engine = new Engine("E", 2000);
        Car car = new Car("TTT", engine);
        car.start();
    }
}
