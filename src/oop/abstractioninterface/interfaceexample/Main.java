package oop.abstractioninterface.interfaceexample;

public class Main {

    public static void main(String[] args) {
        Car petrolCar = new PetrolCar();
        petrolCar.spray("RED");
        petrolCar.turnLeft();

        Car electricCar = new ElectricCar();
        electricCar.spray("BLACK");
        electricCar.turnRight();
    }
}
