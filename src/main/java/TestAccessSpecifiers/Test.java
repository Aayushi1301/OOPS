class D {
    A y = new A();
    y.a();//fail
    y.b();
    y.c();//fail
    y.d();//fail

}

class E extends A {
    A y = new A();
    y.a();//fail
    y.b();
    y.c();
    y.d();//fail
}