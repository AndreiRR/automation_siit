package org.example.oop.inheritance;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
