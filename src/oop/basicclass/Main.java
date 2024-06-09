package oop.basicclass;

public class Main {

    public static void main(String[] args) {
        Car carA = new Car(); // Instantiation
        Car carB = new Car();
        Car carC = new Car();

        carA.spray(ColorOfCar.RED);
        System.out.println(STR."Color of car: \{carA.getColor()}");
    }
}
