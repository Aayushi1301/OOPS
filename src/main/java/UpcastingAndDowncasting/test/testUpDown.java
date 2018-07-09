package UpcastingAndDowncasting.test;

import UpcastingAndDowncasting.solution.Animal;
import UpcastingAndDowncasting.solution.Dog;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class testUpDown {

    @Test
    public void testupcasting(){
        Animal animal_animal = new Animal();
        Animal dog_animal = new Dog();
        Dog dog_dog = new Dog();
        Animal casted_animal = (Animal)dog_dog;
        assertEquals("Upcasting failed",casted_animal.sound,null);
    }
    @Test
    public void testdowncasting(){
        Animal animal_animal = new Animal();
        Animal dog_animal = new Dog();
        Dog dog_dog = new Dog();
        Dog casted_dog = (Dog)dog_animal;
        assertEquals("Upcasting failed",casted_dog.sound,null);
    }
}
