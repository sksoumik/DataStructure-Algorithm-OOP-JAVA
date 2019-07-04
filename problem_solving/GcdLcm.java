package problem_solving;

import java.util.Scanner;

public class GcdLcm {
 // Euclid's algorithm -> solves O(log n)
    public static int GCD(int a, int b) {
        if(a%b == 0){
            return b;
        }else {
            return GCD(b, a%b);
        }
    }

    public static int LCM(int a, int b){
        return a*b/GCD(a,b);
    }


    /************************ Driver Program ************************/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int x= sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The greatest common divisor for "+x+" and "+y+" is: "+
                GCD(x,y));
        System.out.println("The least common multiple for "+x+" and "+y+" is: "+
                LCM(x,y));
    }
}
