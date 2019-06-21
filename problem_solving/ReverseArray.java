package problem_solving;

public class ReverseArray {
    static void reverse(int array[], int length){
        int []rev = new int[length];
        int j = length;
        for (int i = 0; i <length; i++){
            rev[j-1] = array[i];
            j = j-1;
        }
        System.out.println("Reversed array is: \n");
        for(int k = 0; k< length; k++)
        {
            System.out.println(rev[k]);
        }


    }
    public static void main(String[]args)
    {
        int [] ar = {1,2,3,4,5};
        reverse(ar, ar.length);
    }

}
