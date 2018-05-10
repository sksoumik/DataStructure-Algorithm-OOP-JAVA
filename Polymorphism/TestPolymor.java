package Polymorphism;

public class TestPolymor {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.calculate(10,20));

        Child c = new Child();
        System.out.println(c.calculate(2,3));

        Parent x = new Child();
        System.out.println(x.calculate(3,2));
    }
}
