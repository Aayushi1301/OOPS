package test;

import org.junit.Test;
import solution.Trainee;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestMultipleInheritance {
    @Test
    public void testTraineeInterface(){
        Trainee t= new Trainee();
        t.work();
        t.responsibility();
        t.increase_overtime();
        assertEquals("Interface working failed",t.work,1);

    }
    @Test
    public void testTraineeAbstract(){
        Trainee t= new Trainee();
        t.work();
        t.responsibility();
        t.increase_overtime();
        assertEquals("Abstract  class failed",t.responsibility,1);
    }
    @Test
    public void testTrainee(){
        Trainee t= new Trainee();
        t.work();
        t.responsibility();
        t.increase_overtime();
        assertEquals("Trainee  class working failed",t.overtime,1);
    }
}
