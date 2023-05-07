package org.example.oop.inheritance;

public class Shape {

    private String color;

    public void draw() {
        System.out.println("Drawing shape type ... ");
    }

    public void setColor(String color) {
        System.out.println("Setting Shape Color...");
        this.color = color;
    }

    public void erase() {
        System.out.println("Erase Shape...");
    }

    public void getColor() {
        System.out.println("Getting Shape Color...");
    }
}
