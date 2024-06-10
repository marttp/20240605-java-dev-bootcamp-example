package oop.solid.d.bad;

public class Car {

    private final String brand;
    private final Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine("E", 2000); // High Coupling
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
