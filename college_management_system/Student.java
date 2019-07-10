package college_management_system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid   = 0;
        this.feesTotal  = 30000;
        this.id         = id;
        this.name       = name;
        this.grade      = grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }


    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }


    public void updateFeesPaid(int fees){
        feesPaid += fees;
    }






}
