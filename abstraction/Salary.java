package abstraction;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary)
    {
        super(name, address, number);
        this.salary =salary;
    }
    public void mailCheck()
    {
        System.out.println("Mailing a check to"+ getName() + " "+ salary);

    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
