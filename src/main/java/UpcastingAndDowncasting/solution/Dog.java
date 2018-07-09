package UpcastingAndDowncasting.solution;

public class Dog extends Animal {
    public void setSound(){
        sound="Dog Sound";
        System.out.println("sound ="+sound);
    }
    public void print()
    {
        System.out.println("this is dog");
    }
}
