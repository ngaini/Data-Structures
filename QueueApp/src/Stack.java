/**
 * Created by Nathan on 4/13/2016.
 */
public class Stack<Integer> {

    Node top;
    int size;

    Stack()
    {
        top = null;
        size =0;
    }

    int pop()
    {
        Node temp=top;
        if(top == null)
            throw new IllegalStateException("Stack Underflow");
        else
        {

                size--;
                top =top.next;
                temp.next = null;


        }
        return temp.data;
    }

    void push(int data)
    {
        Node newNode = new Node(data);
        if(top == null)
            top =newNode;
        else
        {

            newNode.next = top;
            top =newNode;

        }
        size++;
    }

    boolean isEmpty()
    {
        return(top==null);
    }

    void print()
    {
        Node curr = top;
        if(top == null)
            throw new IllegalStateException("Queue Empty");
        while(curr!=null)
        {
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }

}
