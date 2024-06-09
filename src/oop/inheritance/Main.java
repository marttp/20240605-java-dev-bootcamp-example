package oop.inheritance;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Mart");
        human.speak();
        Cat cat = new Cat();
        cat.setName("cat");
        cat.speak();
        Dog dog = new Dog();
        dog.setName("dog");
        dog.speak();

        human.walk(5);

        Human developer = new Developer();
        developer.setName("Developer");
        developer.walk(10);

        Human businessMan = new BusinessMan();
        businessMan.setName("BusinessMan");
        businessMan.walk(9);
    }
}
