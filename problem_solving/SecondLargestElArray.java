package problem_solving;
//Find the Second largest element from an unsorted array
import java.util.Arrays;

public class SecondLargestElArray {
    public static void main(String[] args) {
        int []ar = {10, 50, 20, 40, 30};
        SecondHighestApproach1(ar);
        SecondHighestApproch2(ar);

    }
    /*Approach 1 is just sort the array and print the array of length-2
    * This will not work if the array contains duplicate elements*/
    private static void SecondHighestApproach1(int [] arr)
    {
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Second highest number is "+ arr[n-2]);

    }
    // Approach 2
    private static void SecondHighestApproch2(int [] arr)
    {
        Integer highest= Integer.MIN_VALUE;
        Integer secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length; i++)
        {
            if(arr[i]> highest)
            {
                secondHighest = highest;
                highest = arr[i];
            }
            if ((arr[i] < highest) && (arr[i] > secondHighest))
            {
                secondHighest = arr[i];
            }

        }

        if(secondHighest == Integer.MIN_VALUE || arr.length <2)
        {
            System.out.println("There is no second highest value");
        }else {
            System.out.println("Second highest value is: "+secondHighest);
        }


    }

}
