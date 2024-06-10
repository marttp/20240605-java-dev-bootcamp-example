package oop.solid.i.bad;

public class Robot implements Worker {

    @Override
    public void work() {
        System.out.println("Robot work");
    }

    // Robot no need to eat and sleep
    // but need to implement worker because they want to perform how worker doing thing
    @Override
    public void eat() {
        throw new RuntimeException("Robot no need to eat");
    }

    @Override
    public void sleep() {
        throw new RuntimeException("Robot no need to sleep");
    }
}
