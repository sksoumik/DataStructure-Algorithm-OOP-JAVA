package stack;
import java.io.*;
import java.util.*;
public class StackTest {

    static void push(Stack<Integer> stack)
    {
        for(int i=0; i<5;i++)
        {
            stack.push(i);
        }
        System.out.println(stack);
    }
    static void pop(Stack<Integer> stack)
    {
        System.out.println("Pop: ");
        for(int i=0; i<5;i++)
        {
            Integer y = (Integer)stack.pop();
            System.out.println(y);
        }
    }

    static void peek (Stack<Integer> stack)
    {
        Integer element = (Integer)stack.peek();
        System.out.println("Top element of stack: "+element);
    }

    static void search (Stack<Integer> stack, int element)
    {
        Integer position = (Integer)stack.search(element);
        if(position == -1){
            System.out.println("Element not found");

        }
        else {
            System.out.println("Element is found at position: "+position);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        push(st);
        pop(st); // Returns the element on the top of the stack, removing it in the process.
        System.out.println("After pop: "+st);
        push(st);
        peek(st); //Returns the element on the top of the stack, but does not remove it.
        search(st, 3);



    }
}
