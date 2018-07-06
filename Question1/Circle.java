public class Circle extends Shape {
    private  double radius;
    final double pi = Math.PI;
  
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