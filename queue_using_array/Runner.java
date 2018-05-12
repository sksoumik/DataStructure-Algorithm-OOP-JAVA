package queue_using_array;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
//        q.display();
//        q.deQueue();
//        q.display();
        q.enQueue(4);
        q.enQueue(5);
        q.display();
        q.enQueue(6);
        q.deQueue();
        q.display();
        q.enQueue(7);
        System.out.println(q.isFull());









    }
}
