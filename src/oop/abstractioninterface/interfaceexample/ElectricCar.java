package oop.abstractioninterface.interfaceexample;

class ElectricCar extends Car {

    @Override
    public void speedUp(int speed) {
        this.setSpeed(this.getSpeed() + speed);
    }

    @Override
    public void slowDown(int speed) {
        this.setSpeed(this.getSpeed() - speed);
    }

    @Override
    public void turnLeft() {
        System.out.println("ElectricCar turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("ElectricCar turn right");
    }
}
