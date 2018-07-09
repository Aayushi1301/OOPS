package AccessSpecifiers.solution;

public class Child_class extends Parent_class{
    void print() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //fails
        //System.out.println(d);
    }

}
