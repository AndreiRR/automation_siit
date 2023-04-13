package org.example.oop.objects;

public class Shapes {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(Double.parseDouble(args[0]));
        rectangle.setLength(Double.parseDouble(args[1]));

        System.out.println("Diagonal value is: " + rectangle.getDiagonal());
        System.out.println("Area value is: " + rectangle.getArea());
        System.out.println("Perimeter value is: " + rectangle.getPerimeter());
    }
}
