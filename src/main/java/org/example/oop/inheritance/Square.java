package org.example.oop.inheritance;

public class Square extends Rectangle {

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
