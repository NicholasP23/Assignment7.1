package com.github.com.nicholasp23.assignment7_1;

import java.util.StringJoiner;

public class Driver {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle(5,5),
                new Square(6),
                new Circle(5),
                new Triangle(5,6)};

        if(shapes[0] instanceof Shape) {
            Rectangle rectangle = (Rectangle) shapes[0];
        }

        if(shapes[1] instanceof Shape) {
            Square square = (Square) shapes[1];
        }

        if(shapes[2] instanceof Shape) {
            Circle circle = (Circle) shapes[2];
        }

        if(shapes[3] instanceof Shape) {
            Triangle triangle = (Triangle) shapes[3];
        }

        for(Shape shape: shapes){
            System.out.println(shape + "\n");
        }
    }

}
