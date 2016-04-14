import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nathan on 4/10/2016.
 */
public class SlidingWindowMax {

      class Queue
    {
        Node first, last;
        int size;

        Queue()
         {
            first = last = null;
             int size = 0;
         }

        void enqueue(int data)
        {
            // since we are using Linked lists we will not have overflow condition
            Node newNode = new Node(data);
            if(size == 0)
            {
                first = last = newNode;
                size++;
            }

            else
            {
                size++;
                last.next = newNode;
//                newNode.next = last;
                last = newNode;


            }
        }

        int dequeue()
        {
            Node temp = first;
            if(size==0)
                throw new IllegalStateException("Queue Underflow");
            else
            {

                first = first.next;
                temp.next = null;
                size--;
            }
            return temp.data;
        }

        boolean isEmpty()
        {
            return(size == 0);
        }

        int size(){ return size;}

        void print()
        {

            int length =0;
            Node curr = first;
            if(first==null)
                System.out.println("Queue Empty");
            else
            {
                while(length<size)
                {
                    System.out.println(curr.data+", len:"+length);
                    curr = curr.next;
                    length++;
                }
            }
        }

        int queueTotalVal()
        {
            int sum =0;
            Node curr = first;
            while(curr!=null)
            {
                sum+= curr.data;
                curr = curr.next;

            }
            return sum;
        }

        int queueMax()
        {
            int max =0;
            Node curr = first;
            while(curr!=null)
            {
                if(curr.data>=max)
                {
                    max = curr.data;
                }
                curr = curr.next;

            }
            return max;

        }

    }



    int slidingWindowVal(Queue q1)
    {
//       return q1.queueTotalVal();
       return q1.queueMax();
    }

    // implement queue enqueue and dequeue methods


    // move sliding window
    private void moveSlidingWindow(int data, Queue queue1)
    {

            // enqueue the data you want to input at the rear
            queue1.enqueue(data);

            //deque from the front
            int val = queue1.dequeue();





    }
    // calculate the max of the window


    public static void main(String args[])
    {
        SlidingWindowMax slidingWindow = new SlidingWindowMax();
        SlidingWindowMax.Queue queue =  slidingWindow.new Queue();
        int[] intArr = {1,3,-1,-3,5,3,6,7};
        int max;

        // construct the queue
        System.out.println(queue.size());
        queue.enqueue(intArr[0]);
        queue.enqueue(intArr[1]);
        queue.enqueue(intArr[2]);
        System.out.println(queue.last.data);
        queue.print();
        int temp = max=0;
        for(int i=2;i<=(intArr.length-1);i++)
        {
            temp=0;
            if(i==2)
                temp =slidingWindow.slidingWindowVal(queue);
            else
            {
                slidingWindow.moveSlidingWindow(intArr[i],queue);
                temp =slidingWindow.slidingWindowVal(queue);
            }
            if(temp>max)
            {
                max=temp;
            }
            System.out.println("Max of the sliding window is "+max);

        }


        //move the sliding window
               // enque and dequeue and element each time the sliding window moves
        // get the max each time before the sliding window moves



    }
}
