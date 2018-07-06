class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    public static void main(String args[]) {
        Animal a = new Dog();
        a.eat();
    }

    void eat() {
        System.out.println("dog is eating...");
    }
}