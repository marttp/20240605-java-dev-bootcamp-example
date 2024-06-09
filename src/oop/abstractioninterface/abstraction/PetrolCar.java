package oop.abstractioninterface.abstraction;

class PetrolCar extends Car {

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
        System.out.println("PetrolCar turn left");
    }

    @Override
    void turnRight() {
        System.out.println("PetrolCar turn right");
    }
}
