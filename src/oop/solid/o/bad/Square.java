package oop.solid.o.bad;

public class Square implements Shape {

    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
