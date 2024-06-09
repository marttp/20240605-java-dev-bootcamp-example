package oop.abstractioninterface.abstraction;

class ElectricCar extends Car {

    @Override
    void speedUp(int speed) {
        this.setSpeed(this.getSpeed() + speed);
    }

    @Override
    void slowDown(int speed) {
        this.setSpeed(this.getSpeed() - speed);
    }

    @Override
    void turnLeft() {
        System.out.println("ElectricCar turn left");
    }

    @Override
    void turnRight() {
        System.out.println("ElectricCar turn right");
    }
}
