/**
 * Created by Nathan on 4/12/2016.
 */
public class Queue {

    private Node front, rear;



    private int size;

    Queue()
    {
        int size=0;
        front = rear = null;
    }

    void enqueue(int data)
    {

        //insert from back of the queue
        Node newNode = new Node(data);
        if(front== null)
        {
            front = rear = newNode;
            size++;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
            size++;
        }
    }

    int dequeue()
    {
        Node temp = front;
        if(front ==null)
            throw new IllegalStateException("Queue Underflow");
        else
        {
            size--;
            front = front.next;
            temp.next = null;
        }
        return temp.data;
    }

    boolean isEmpty()
    {
        return (size==0);
    }
    void print()
    {
        Node curr = front;
        while(curr!=null)
        {
            System.out.print(" "+curr.data);
            curr= curr.next;
        }
        System.out.println("\n");

    }
    public int getSize() {
        return size;
    }

    /**
     *
     * code for interleaving the queue below
     */
     void interleavingQueue()
     {
         if((size%2)!=0)
             throw new IllegalStateException("Queue is Empty");
         else
         {  //initialize a stack and find half of the size
             int length = size;
             int halfSize= size/2;
             Stack<Integer> stack = new Stack<Integer>();
             // transfer first half into the stack

//             for (int i=0;i<length;i++)
             for (int i=0;i<halfSize;i++)
             {
                stack.push(this.dequeue());
             }
//             System.out.println("\nstack values are");
//             stack.print();
             //pop the stack untill it is empty
             while(stack.top!=null)
             {
                 this.enqueue(stack.pop());
             }

             //enqueue and dequeue the elements of the stack
             for (int i=0;i<halfSize;i++)
             {
                 this.enqueue(this.dequeue());
             }
             //again dequeue half the stack and push dequeued elemets into stack
             for (int i=0;i<halfSize;i++)
                 stack.push(this.dequeue());



             // while the stack is not empty
                // pop element from the stack and enqueue
                // also enqueue and dequeue
             while(stack.top!=null)
             {
                 this.enqueue(stack.pop());
                 this.enqueue(this.dequeue());

             }
             this.print();
         }
     }

    void reverseFirstKElements(int k)
    {
        Stack s = new Stack();
        for(int i=0; i<k;i++)
            s.push(this.dequeue());

//        s.print();
        while(s.top!=null)
            this.enqueue(s.pop());
        for(int i=0; i<(this.size -k);i++)
            this.enqueue(this.dequeue());


        this.print();
    }
    public static void main(String args[])
    {
//        Queue queue = new Queue();
//        queue.enqueue(11);
//        queue.enqueue(12);
//        queue.enqueue(13);
//        queue.enqueue(14);
//        queue.enqueue(15);
//        queue.enqueue(16);
//        queue.enqueue(17);
//        queue.enqueue(18);
//        queue.enqueue(19);
//        queue.enqueue(20);
//        queue.print();
////        for(int i = 0; i<2; i++)
////        {
////            queue.dequeue();
////            queue.print();
////        }
//        // interleaving method
//        queue.interleavingQueue();

        /**
         * problem #9 karumanchi solution
         */
        int k =4;
        System.out.println(" The value of k is "+k);
        Queue queue1 = new Queue();
        for(int i = 1; i<10; i++)
        {
            queue1.enqueue(i*10);
        }
        queue1.print();
        queue1.reverseFirstKElements(k);

    }

}
