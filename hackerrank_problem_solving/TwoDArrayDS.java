package hackerrank_problem_solving;
import java.io.*;
import java.util.*;
/*
* Problem link: https://www.hackerrank.com/challenges/2d-array/problem
* Problem Solution Hint: https://www.youtube.com/watch?v=mxnJTY7TXo0
*
* */
public class TwoDArrayDS {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        int [][] arr = new int[6][6];

        for(int row=0; row<6; row++)
        {

            for (int col = 0; col<6; col++)
            {
                arr[row][col] = sc.nextInt();
            }
        }
        int maxHourGlass = Integer.MIN_VALUE;

        for(int row = 0; row<4; row++)
        {
            for(int col = 0; col<4; col++)
            {
                int sum = arr[row][col]+arr[row][col+1]+arr[row][col+2]
                        + arr[row+1][col+1]
                        + arr[row+2][col]+arr[row+2][col+1]+arr[row+2][col+2];

                if(sum>maxHourGlass)
                {
                  maxHourGlass = sum;
                }

            }
        }
        System.out.println(maxHourGlass);
        sc.close();


    }
}
