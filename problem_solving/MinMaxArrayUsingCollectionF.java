package problem_solving;
import java.util.*;
import java.io.*;
// Find the minimum number from an unordered list/array using Java Collection framework

public class MinMaxArrayUsingCollectionF {
    private static Integer findMin(List<Integer> list)
    {
        // first, check if the list is empty or not
        if (list == null || list.size()==0){
            return Integer.MAX_VALUE;
        }
        return Collections.min(list);
    }

    private static Integer findMax(List<Integer> list)
    {
        // first, check if the list is empty or not
        if (list == null || list.size()==0){
            return Integer.MIN_VALUE;
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(30);

        System.out.println("Min : "+ findMin(list) );
        System.out.println("Max : "+ findMax(list) );

    }

}
