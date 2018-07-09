package UpcastingAndDowncasting.main;

import UpcastingAndDowncasting.solution.Animal;
import UpcastingAndDowncasting.solution.Dog;

public class Main2 {
public static void main(String[] args){
    Animal original_animal = new Animal();
    original_animal.print();
    original_animal.setSound();
    Animal dog_animal = new Dog();
    Dog dog1 = new Dog();
    dog_animal.print();
    dog_animal.setSound();
    dog1.print();
    dog1.setSound();
    //upcasting
    Animal casted_animal = (Animal)dog1;
    casted_animal.print();
    casted_animal.setSound();
    //downcasting
    Dog casted_dog = (Dog)dog_animal;
    casted_dog.print();
    casted_dog.setSound();
    //downcasting but it will throw exception
    try{Dog error_dog = (Dog)original_animal;}
    catch(Exception e)
    {
        System.out.println("it is original animal so a super class object cannot be downcasted into subclass object.");
    }
}
}


