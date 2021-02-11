package com.github.com.nicholasp23.assignment7_1;
public class Square extends Shape {

    private final double length;

    public Square(double length){
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
    @Override
    public String toString() {
        return "--Information on the Square--\n" +
                "Area: " + getArea() + "\n" +
                "Length: " + length;
    }
}
