public class Circle extends Shape {
    final double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }
}