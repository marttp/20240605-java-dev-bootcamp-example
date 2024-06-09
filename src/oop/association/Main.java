package oop.association;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Mart1", 27);
        Person p2 = new Person("Mart2", 27);

        Address a1 = new Address("1", "Tokyo");
        Address a2 = new Address("2", "Saitama");

        p1.addAddress(a1);
        p2.addAddress(a2);
    }
}
