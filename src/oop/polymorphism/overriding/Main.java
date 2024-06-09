package oop.polymorphism.overriding;

public class Main {

    public static void main(String[] args) {
        Animal animal; // Parent class wait for child class to perform
        animal = new Human(); // Point to Human
        animal.makeSound();
        animal = new Dog(); // Point to Dog
        animal.makeSound();
        animal = new Cat(); // Point to Cat
        animal.makeSound();
    }
}
