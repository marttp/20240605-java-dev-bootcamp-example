package oop.polymorphism.overriding;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Booooo");
    }
}
