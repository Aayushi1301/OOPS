public class TestShape {
    public static void main(String[] args) {

        // Rectangle test
        double side = 5;
        Shape square = new Square(side);
        System.out.println("Square side: " + side
                + "\nResulting area: " + square.getArea()
                + "\nResulting perimeter: " + square.getPerimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.getArea()
                + "\nResulting Perimeter: " + circle.getPerimeter() + "\n");
    }
}