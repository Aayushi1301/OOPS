package test;

import solution.Circle;
import solution.Square;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class TestShape {

    @Test
    public void findFilesTest1(){

       Square s=new Square(4);
       Circle c=new Circle(3.5);
       double area=16;
       double perimeter=16;
       assertEquals(area,s.getArea());
       assertFalse(area==c.getArea());
       assertEquals(perimeter,s.getPerimeter());
       assertFalse(perimeter==c.getPerimeter());

    }
}