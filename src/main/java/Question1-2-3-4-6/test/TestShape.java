package test;

import solution.Circle;
import solution.NegativeNumberException;
import solution.Square;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static org.junit.Assert.assertFalse;


public class TestShape {

    @Test
    public void TestSquareArea()throws NegativeNumberException {

        Square s=new Square(4);
        assertEquals("Testing Area of square failed",16.0,s.getArea());

    }
    @Test
    public void TestSquarePerimeter()throws NegativeNumberException{

        Square s=new Square(4);
        assertEquals("Testing Perimeter of square failed",16.0,s.getPerimeter());

    }
    @Test
    public void TestCircleArea()throws NegativeNumberException{

        Circle c=new Circle(4);
        assertNotSame("Testing Area of circle failed",16.0,c.getArea());

    }
    @Test
    public void TestCirclePerimeter()throws NegativeNumberException{

        Circle c=new Circle(4);
        assertNotSame("Testing Perimeter of circle failed",16.0,c.getArea());

    }
    @Test
    public void TestEquals()throws NegativeNumberException{
        Square s=new Square(4);
        Circle c=new Circle(4);
        assertFalse("Testing equal method failed",s.equals(c));
    }
    @Test
    public void TestException() throws NegativeNumberException {
        Circle s=new Circle(-4);
        assertNotSame("Testing for negative  side failed",16.0,s.getArea());

    }
}