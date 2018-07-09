package solution;

public class Circle extends Shape {
    final double pi = Math.PI;

    public Circle(double side) throws NegativeNumberException {
        super(side);
    }

    @Override
    public double getArea() throws NegativeNumberException{
        try{if(height<0)
            throw new NegativeNumberException("Negative numbers not allowed");
            else
            return pi * Math.pow(height/2, 2);}
        catch (NegativeNumberException ex){
            System.out.println("Caught");
        }
        return 0;
    }
    @Override
    public double getPerimeter() throws NegativeNumberException{
        try{if(height<0)
            throw new NegativeNumberException("Negative numbers not allowed");
        else
            return 2*pi*height/2;}
        catch (NegativeNumberException ex){
            System.out.println("Caught");
        }
        return 0;
    }
    @Override
    public String toString(){

        try {
            return "Radius of circle  = "+height+" Area of circle =  "+getArea()+" Perimeter of circle = "+getPerimeter();
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public boolean equals(Object o) {
        if (o.getClass() == this.getClass()) {
            try {
                if ((((Square) o).getArea() == this.getArea()) && (((Square) o).getPerimeter() == this.getPerimeter()))
                    return true;
            } catch (NegativeNumberException e) {
                e.printStackTrace();
            }
        } else
            return false;
        return false;
    }
}