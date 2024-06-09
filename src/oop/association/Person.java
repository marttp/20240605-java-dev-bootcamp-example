package oop.association;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;

    private List<Address> address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addAddress(Address address) {
        this.address.add(address);
    }
}
