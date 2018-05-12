package linked_list;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.insertAtStart(30);
        list.insertAt(0,25);
        list.show();

    }
}
