package Polymorphism;

public class Child extends Parent {
    // Overriding -- same method name and same signature and same return type
    public double calculate(int x, int y)
    {
        return x*y;
    }
    // Overloading -- same name but different signature
    public String display(String name, int age, double salary)
    {
        return name + age+ salary;

    }


}
