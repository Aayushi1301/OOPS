package solution;

import java.util.Objects;

public abstract class Shape {
    public double width;
    public double height;

    /**
     * @param side
     * constructor overloading
     */
    public Shape(double side)throws NegativeNumberException{
        this(side,side);
    }

    /**
     *
     * @param width
     * @param height
     * constructor overloading
     */
    public Shape(double width,double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public abstract boolean equals(Object o) ;


    public abstract double getArea() throws NegativeNumberException;

    public abstract double getPerimeter() throws NegativeNumberException;
}
