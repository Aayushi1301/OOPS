class Parent {

    void show() {
        System.out.println("Parent's show()");
    }

    //overloading
    void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    //overloading
    void add(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show()");
        //child's class show method
        this.show();
        //parent's class show mehtod
        super.show();
    }
}

class Main {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        obj1.show();
        Parent obj2 = new Child();
        obj2.show();
        obj1.add(3, 4);
        obj1.add(2.1, 3.1);
    }
}
