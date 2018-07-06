public class Square extends Shape {
    private final double width, length; //sides

    public Square() {
        this(1,1);
    }
    public Square(double side) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        
        return side * side;
    }

    @Override
    public double perimeter() {
        
        return 4* side;
    }

}