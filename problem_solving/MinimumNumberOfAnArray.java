package problem_solving;
// Find the minimum number from an unordered list/array in a naive way 
public class MinimumNumberOfAnArray {
    public static void main(String[] args) {
        int [] x = {20,4,5,10};
        System.out.println("Minimum Value: "+MinArray(x));
        System.out.println("Maximum Value: "+MaxArray(x));

    }
    static int MinArray(int [] arr)
    {
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }
        }

        return min;
    }
    static int MaxArray(int [] arr)
    {
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }

        return max;
    }
}
