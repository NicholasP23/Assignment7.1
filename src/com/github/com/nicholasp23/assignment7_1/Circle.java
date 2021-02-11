package com.github.com.nicholasp23.assignment7_1;
public class Circle extends Shape{

    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
    @Override
    public String toString() {
        return "--Information on the Circle--\n" +
                "Area: " + getArea() + "\n" +
                "Radius: " + radius;
    }
}
