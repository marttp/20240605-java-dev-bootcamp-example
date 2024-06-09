package oop.composition;

public class Car {

    private final String brand;
    private final Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine("E", 2000);
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return STR."Car{brand='\{brand}\{'\''}, engine=\{engine}\{'}'}";
    }
}
