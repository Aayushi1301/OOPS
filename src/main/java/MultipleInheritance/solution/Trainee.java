package solution;

public class Trainee extends Employee {

    public int overtime;
    public void increase_overtime() {
        overtime=1;
        System.out.println("overtime of trainee will be increased. Overtime= "+overtime);
    }
}