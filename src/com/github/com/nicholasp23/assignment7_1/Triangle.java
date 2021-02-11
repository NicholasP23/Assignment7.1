package com.github.com.nicholasp23.assignment7_1;

public class Triangle extends Shape{

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (base*height)/2;
    }
    @Override
    public String toString() {
        return "--Information on the Triangle--\n" +
                "Area: " + getArea() + "\n" +
                "Base: " + base +
                "\nHeight: " + height;
    }
}
