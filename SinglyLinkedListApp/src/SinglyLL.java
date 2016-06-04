/**
 * Created by Nathan on 4/15/2016.
 */
public class SinglyLL {

    Node head;

    SinglyLL()
    {
        head = null;
    }

    void insertAtStart(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
            head =newNode;
        else
        {
            newNode.next = head;
            head = newNode;
        }

    }

    void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        Node curr = head;
        if(head==null)
            head =newNode;
        else
        {
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next = newNode;

        }
    }

    void print()
    {
        Node curr = head;
        if(head==null)
            throw new IllegalStateException("LinkedList is Empty");
        else
        {
            while(curr!=null)
            {
                System.out.print(" "+curr.data);
                curr=curr.next;
            }
            System.out.println("\n");
        }
    }

    Node find(int key)
    {
        Node curr = head;
        if(head==null)
            throw new IllegalStateException("Linked List Empty");
        else
        {
            while(curr!= null)
            {
                if(curr.data==key)
                    return curr;
                else
                    curr= curr.next;

            }
        }
        if(curr==null) throw new IllegalStateException("key does not exist");
        return curr;
    }

    void delete(int key)
    {
        Node curr = head;
        Node prev = null;
        if(head == null)
            throw new IllegalStateException("Linked List is Empty");
        else
        {
            while(curr.next != null)
            {
                if(curr.data==key)
                {
                    //delete that node
                    prev.next = curr.next;
                    curr.next = null;
                    System.out.println("Deleted "+curr.data);

                    return;
                }
                prev= curr;
                curr=curr.next;
            }
        }
    }

    /**
     * in this case we are inserting after the specific key
     * in case of inserting before the key we will need prev variable
     * @param data
     * @param key
     */
    void insertAtKey(int data, int key)
    {
        Node curr = head;
        int pos =0;
        if(head== null)
            throw new IllegalStateException("Linked List Empty");
        else
        {
            while(curr!=null)
            {
                if(curr.data == key)
                {
                    // insert after the node
                    Node newNode = new Node(data);
                    newNode.next = curr.next;
                    curr.next = newNode;
                    return;


                }
                curr=curr.next;
                pos++;
            }
        }
        throw new IllegalStateException("Key Not Found");

    }

    /**
     * geek for geeks : Swap nodes in a linked list without swapping data
     * iterative process
     * @param key1
     * @param key2
     */
    void swappingNodes(int key1, int key2)
    {
        Node curr1 =head, curr2 = head;
        Node prev1, prev2;
        prev1 = prev2 = null;
        while(curr1!=null)
        {
            if(curr1.data==key1)
            {
                break;
            }
            prev1 = curr1;
            curr1 = curr1.next;
        }
        curr2=curr1;
        while(curr2!=null)
        {
            if(curr2.data==key2)
            {
                break;
            }
            prev2 = curr2;
            curr2 = curr2.next;
        }
        Node temp1=curr1.next;
        Node temp2=curr2.next;
        curr1.next =curr2.next;
        prev2.next = curr1;
        curr2.next = temp1;
        prev1.next = curr2;
//        curr1.next = curr2.next;
//        prev2.next =curr1;
//        curr2.next = temp1;
//        prev1.next=curr2;




    }

    Node reverseList()
    {
        Node curr = head;
        Node prev=null;
        Node next = null;
        while(curr !=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next ;

        }
        head = prev;
        return head;
    }


    /**
     * Detect and remove loop in linked list (using Floyds Cycle detection ) : geek for geeks question
     */

    int detectLoop()
    {
        Node slow = head;
        Node fast = head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next ;
            fast = fast.next.next;
            if(slow == fast)
            {
                removeLoop(slow, head);
                return 1;
            }
        }
        return 0;
    }

    void removeLoop(Node loop, Node curr)
    {
        Node ptr1, ptr2 ;

        ptr1 = loop ;
        ptr2 = loop;
        int k=1;
        while( ptr1.next != ptr2)
        {
            ptr1 = ptr1.next;
            k++;
        }

        ptr1 = curr;
        ptr2 = curr;
        for(int i=0; i<k; i++)
        {
            ptr2 = ptr2.next;
        }
        while(ptr2!= ptr1 )
        {
            ptr1 = ptr1.next ;
            ptr2 = ptr2.next ;

        }
        ptr2 = ptr2.next;
        while(ptr2.next!= ptr1)
        {
            ptr2 = ptr2.next ;

        }
        ptr2.next = null;
    }

}
