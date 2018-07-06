class A {
    //default member
    void a() {
        System.out.println("a function of A class");
    }

    //public member
    public void b() {
        System.out.println("b function of A class");
    }

    //protected member
    protected void c() {
        System.out.println("c function of A class");
    }

    //private member
    private void d() {
        System.out.println("d function of A class");
    }

}

class B extends A {
    A x = new A();
    x.a();
    x.b();
    x.c();
    x.d();//fail

}

class C {
    A y = new A();
    y.a();
    y.b();
    y.c();
    y.d();//fail
}