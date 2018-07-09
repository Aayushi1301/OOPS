package solution;

public class Square extends Shape {
    private double side;


    public Square(double side) {
        this.side=side;
    }

    @Override
    public double getArea() {
        double  area=side * side;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter=4 * side;
        return perimeter;
    }
    public String toString(){//overriding the toString() method
        return side+" "+getArea()+" "+getPerimeter();
    }

}