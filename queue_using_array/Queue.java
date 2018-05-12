package queue_using_array;

public class Queue {
    private int [] queue;
    private int size;
    private int capacity;
    private int front;
    private int rear;

    public Queue()
    {
        size = 100;
        capacity = 0;
        front = 0;
        rear = 0;
        queue = new int[size];
    }

    public Queue(int size)
    {
        this.size = size;
        capacity = 0;
        front = 0;
        rear = 0;
        queue = new int[this.size];
    }
    public boolean enQueue(int item)
    {
        if(isFull())
        {
            return false;
        }
        else {
            capacity++;
            queue[rear] = item;
            rear = (rear+1)% size;
            return true;

            }

    }
    public int deQueue()
    {

            int item = queue[front];
            capacity--;
            front = (front+1)%size;
            return item;
    }
    public boolean isFull()
    {
        return size == capacity;

    }
    public boolean isEmpty()
    {
        return capacity ==0;
    }

    public  void display()
    {
        int f = front;
        if(capacity != 0)
        {
            for(int i=0; i<capacity;i++)
            {
                System.out.println(queue[f]+" ");
                f = (f+1)%size;
            }
            System.out.println();

        }
        else {
            System.out.println("No item in Queue");
        }

    }





}
