package UpcastingAndDowncasting.solution;

public class Animal {
    protected String sound;
    public void setSound(){
        sound="Animal Sound";
        System.out.println("sound ="+sound);
    }
    public void print()
    {
        System.out.println("this is animal");
    }
}
