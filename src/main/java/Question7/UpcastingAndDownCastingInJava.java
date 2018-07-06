public interface Mammal {
    public void eat();

    public void move();

    public void sleep();
}

public abstract class Animal implements Mammal {
    public void eat() {
        System.out.println("Eating...");
    }

    public void move() {
        System.out.println("Moving...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

}

public class Dog extends Animal {
    public void bark() {
        System.out.println("Gow gow!");
    }

    public void eat() {
        System.out.println("Dog is eating...");
    }
}

public class Cat extends Animal {
    public void meow() {
        System.out.println("Meow Meow!");
    }
}


public class testClass {
    public static void main() {
        //upcatsing
        Dog dog = new Dog();
        Animal anim = (Animal) dog;
        anim.eat();
        //downcasting
        Animal anim = new Cat();
        Cat cat = (Cat) anim;
    }
}