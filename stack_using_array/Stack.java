package stack_using_array;

public class Stack {
    private int [] stack;
    private int top;
    private int size;
    public Stack()
    {
        top = -1;
        size = 50;
        stack = new int[50];
    }

    //------------------------------------------

    public Stack( int size)
    {
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }
    //-------------------------------------------
    public boolean isEmpty()
    {
        return (top < 0);
    }

    //---------------------------------------------
    public boolean push(int item)
    {
        if(top>=stack.length)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            stack[++top] = item;
            return true;
        }

    }
    //-------------------------------------------------

    public int pop()
    {
        if(top < 0)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else
        {
            int item = stack[top--];
            return item;
        }

    }
    //----------------------------------------------------

    public void display()
    {
        for(int i=0; i<=top; i++)
        {
            System.out.println(stack[i]+"  ");
        }
        System.out.println();
    }











}
