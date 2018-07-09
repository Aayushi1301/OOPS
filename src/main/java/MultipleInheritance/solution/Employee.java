package solution;

public abstract class Employee implements Engineer,Manager{
    abstract public void increase_overtime();
    public int responsibility;
    public int work;
    public void responsibility()
    {
        responsibility=1;
        System.out.println("Employee has some responsibility.Responsibility="+responsibility);
    }
    public void work()
    {
        work=1;
        System.out.println("Employee is Working. Working="+work);
    }

}
