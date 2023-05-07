package org.example.oop.inheritance;

public class Car {
    private final int MIN_ANGLE = -30;
    private final int MAX_ANGLE = 30;
    private final int MAX_SPEED = 280;

    private int speed;
    private boolean isEngineOn;
    private int angle;

    private String model;
    private String brand;
    private int horsePower;

    public int getSpeed() {
        return Math.abs(speed);

    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String toString() {
        return "Car brand " + getBrand() +
                " model " + getModel() +
                " horse power " + getHorsePower();
    }
}
