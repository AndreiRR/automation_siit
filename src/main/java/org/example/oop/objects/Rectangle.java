package org.example.oop.objects;

public class Rectangle {

    private double width;
    private double length;

    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Width must be greater than 0");
            this.width = 1;
        } else {
            this.width = width;
        }
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
    }
}
