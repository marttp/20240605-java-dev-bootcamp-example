package oop.abstractioninterface.abstraction;

abstract class Car {

    private String color;
    private int speed;

    public String getColor() {
        return this.color;
    }

    // declare default to abstract
    public void spray(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    abstract void speedUp(int speed);
    abstract void slowDown(int speed);
    abstract void turnLeft();
    abstract void turnRight();
}
