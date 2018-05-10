package map;

import java.util.Scanner;

//A Map cannot contain duplicate keys and each key can map to at most one value
public  class MapTest {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        double result = num1 + num2;

        System.out.println("The calculate is: "+result);


    }
}
