package abstraction;

public class Test {
    public static void main(String[] args) {
        Employee em = new Salary("Kabir","kabir@gmail.com", 20, 2000);
        Salary s = new Salary("soumik", "sadmanks@gmail.com", 017,500000);
        System.out.println(s.getSalary());




    }
}
