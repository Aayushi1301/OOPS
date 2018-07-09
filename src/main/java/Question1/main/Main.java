package main;

import solution.Circle;
import solution.Square;
import solution.Shape;

public class Main {
    public static void main(String[] args) {

        // Rectangle test
        double side = 5;
        Shape square = new Square(side);
        System.out.println(square.toString());

        // solution.Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println(circle.toString());
    }
}
