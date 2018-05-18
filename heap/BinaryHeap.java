package heap;
// min_heap implementation using array
import java.util.Arrays;
import java.util.NoSuchElementException;

//Binary Heap implementation using Array
public class BinaryHeap {
    // The number of children each node has.
    private static final int d = 2;
    private int heapSize;
    private int[] heap;

//     Constructor
    public BinaryHeap(int capacity)
    {
        heapSize = 0;
        heap = new int[capacity + 1];
        Arrays.fill(heap, -1);
    }
    /** Function to check if heap is empty **/
    public boolean isEmpty()
    {
        return heapSize == 0;
    }

    /** Check if heap is full **/
    public boolean isFull()
    {
        return heapSize == heap.length;
    }
    /** Clear heap */
    public void makeEmpty()
    {
        heapSize = 0;
    }
    /** Function to  get index parent of i **/
    private int parent(int i)
    {
        return (i-1)/d;
    }

    /** Function to get index of k th child of i **/
    private int kthChild(int i, int k)
    {
        return d*i + k;
    }
    /**Function to insert element*/
    public void insert(int x)
    {
        if(isFull())
        {
            throw new NoSuchElementException("Overflow Exception");
        }
        else {
            heap[heapSize++] = x;
            heapifyUp(heapSize-1);

        }
    }
    /** Function heapifyUp  **/
    public void heapifyUp(int childIndex)
    {
        int temp = heap[childIndex];
        while (childIndex > 0 && temp < heap[parent(childIndex)])
        {
            heap[childIndex] = heap[parent(childIndex)];
            childIndex = parent(childIndex);

        }
        heap[childIndex] = temp;


    }

    /** Function heapifyDown **/

    public void heapifyDown(int ind)
    {
        int child;
        int temp = heap[ind];
        while (kthChild(ind, 1) < heapSize)
        {
            child = minChild(ind);
            if(heap[child] < temp)
            {
                heap[ind] = heap[child];
            }
            else {
                break;
            }
            ind = child;
        }
        heap[ind] = temp;
    }

    /** Function to get smallest child **/
    private int minChild(int ind)
    {
        int bestChild = kthChild(ind, 1);
        int k =2;
        int pos = kthChild(ind, k);
        while ((k <= d) && (pos < heapSize)){
            if(heap[pos] < heap[bestChild])
            {
                bestChild = pos;
            }
            else {
                pos = kthChild(ind, k++);
            }
        }
        return bestChild;

    }
    /** Function to find least element **/
    public int findMin()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Underflow Exeption");
        }
        return heap[0];
    }
    /** Function to delete element at an index **/
    public int delete(int ind)
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Underflow Exeption");
        }
        else {
            int keyItem = heap[ind];
            heap[ind] = heap[heapSize-1];
            heapSize--;
            heapifyDown(ind);
            return keyItem;
        }
    }
    public int deleteMin()
    {
        int keyItem = heap[0];
        delete(0);
        return keyItem;
    }

    public void printHeap()
    {
        System.out.println("\nHeap = ");
        for(int i=0; i< heapSize; i++)
        {
            System.out.println(heap[i]+"  ");
        }
        System.out.println();
    }






}
