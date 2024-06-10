package oop.solid.d.good;

public class Car {

    private final String brand;
    private final Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        this.engine.start();
        System.out.println("Car started");
    }
}
