package com.github.com.nicholasp23.assignment7_1;

public class Rectangle extends Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public String toString() {
        return "--Information on the Rectangle--\n" +
                "Area: " + getArea() + "\n" +
                "Length : " + length +
                "\nWidth: " + width;
    }
}
