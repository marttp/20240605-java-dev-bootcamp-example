package oop.inheritance;

public class Human extends Animal {

    public void walk(int steps) {
        System.out.println(STR."\{this.getName()} walk \{steps} steps");
    }
}
