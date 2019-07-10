package problem_solving;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String in = scanner.nextLine();

        // Index of the first character of the String
        int low = 0;
        // Index of the last character of the String
        int high = in.length() - 1;

        boolean isPalindrome = true;
        while (low < high){
            if (in.charAt(low)!= in.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindrome){
            System.out.println(in + " is a palindrome");
        }else {
            System.out.println(in + " is not a palindrome");
        }
    }
}
