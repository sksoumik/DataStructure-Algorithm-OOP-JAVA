package encapsulationTest;

public class Student {
    private String studentName;
    private int roll;
    private int age;

    public int getRoll()
    {
        return roll;
    }
    public int getAge()
    {
        return age;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentName(String newName)
    {
        this.studentName = newName;
    }
    public void setRoll(int newRoll)
    {
        this.roll = newRoll;
    }
    public void setAge(int newAge)
    {
        this.age = newAge;
    }
}
