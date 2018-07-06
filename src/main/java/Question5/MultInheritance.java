interface InterfaceA {
    public void disp();
}

interface InterfaceB {
    public void disp();
}

abstract class AbstractC {
    public void show();
}

public class MultInheritance implements InterfaceA, InterfaceB extends AbstractC {
    public static void main(String args[]) {
        MultInheritance c = new MultInheritance();
        c.disp();
    }

    @Override
    public void disp() {
        System.out.println("disp() method implementation");
    }
}