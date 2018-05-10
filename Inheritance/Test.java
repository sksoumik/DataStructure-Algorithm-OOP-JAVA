package Inheritance;

public class Test {
    public static void main(String[] args) {
        Bicycle b = new Bicycle(3, 100);
        System.out.println(b.toString());
        MountainBike m = new MountainBike(20, 10, 120);
        System.out.println(m.toString());
        b.applyBreak(20);
        System.out.println(b.toString());
        b.speedUp(200);
        System.out.println(b.toString());


    }
}
