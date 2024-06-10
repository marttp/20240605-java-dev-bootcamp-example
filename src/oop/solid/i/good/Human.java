package oop.solid.i.good;

public class Human implements Workable, Eatable, Sleepable {

    @Override
    public void work() {
        System.out.println("Human work");
    }

    @Override
    public void eat() {
        System.out.println("Human eat");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleep");
    }
}
