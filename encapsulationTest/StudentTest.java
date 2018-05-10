package encapsulationTest;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setRoll(1511109042);
        s.setStudentName("Soumik");
        System.out.println(s.getAge());
        System.out.println(s.getStudentName());
        System.out.println(s.getAge()+"  "+s.getStudentName()+"  "+s.getRoll());

    }
}
