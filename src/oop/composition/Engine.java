package oop.composition;

public class Engine {

    private String brand;
    private int horsepower;

    public Engine(String brand, int horsepower) {
        this.brand = brand;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return STR."Engine{brand='\{brand}\{'\''}, horsepower=\{horsepower}\{'}'}";
    }
}
