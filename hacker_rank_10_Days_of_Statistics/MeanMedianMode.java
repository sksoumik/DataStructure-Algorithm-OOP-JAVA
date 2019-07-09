package hacker_rank_10_Days_of_Statistics;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MeanMedianMode {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] inputArr = new int[size];
        double sum = 0;
        for(int i = 0; i < size; i++){
            inputArr[i] = in.nextInt();
            sum += inputArr[i];
        }
        //mean
        System.out.println(sum / size);

        //median
        Arrays.sort(inputArr);
        if(size % 2 == 1){ //odd
            System.out.println(inputArr[size/2]);
        } else { //even
            System.out.println((inputArr[size/2] + inputArr[(size/2-1)]) / 2.0);
        }

        //mode
        HashMap hm = new HashMap();

        for(int i = 0; i < size; i++){
            if(hm.get(inputArr[i]) == null){
                hm.put(inputArr[i], 1);
            } else{
                int val = (int) hm.get(inputArr[i]);
                hm.put(inputArr[i], val + 1);
            }
        }
        int minCount = 0;
        int mode = 0;
        for(int i = 0; i < size; i++){
            Object obj = hm.get(inputArr[i]);
            if((int) (obj) > minCount){
                mode = inputArr[i];
                minCount = (int) obj;
            }
        }
        System.out.println(mode);
    }
}