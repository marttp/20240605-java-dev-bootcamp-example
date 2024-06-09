package oop.abstractioninterface.interfaceexample;

abstract class Car implements ChangeSpeed, Turn {

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
}
