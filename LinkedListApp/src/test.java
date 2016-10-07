/**
 * Created by Nathan on 9/17/2016.
 */
public class test {




    static Node deleteEven(Node list) {
        if(list == null) {System.out.print(" List is Emty"); return null;}
        Node curr = list;
        Node prev = null;
        Node head = list;

        while(curr != null)
        {
            if(curr.data %2 ==0)
            {
                System.out.println(curr.data);

                if(curr == head)
                {
                    // delete first
                    Node temp = head;
                    head = curr.next;
                    temp.next = null;
                    curr = head;
                    prev = null;
                    prev = curr;
                    curr = curr.next;

                }
                else if(curr != head && curr.next == null)
                {

                    //delete end
                    prev.next = null;
                    prev = curr;
                    curr = curr.next;


                }
                else
                {

                    Node temp = curr;

                    curr = curr.next;
                    prev.next = curr;
                    temp.next = null;



                }

            }
            else
            {
                prev = curr;
                curr = curr.next;
            }
            //else
            //{

            //}

            //prev = curr;
            //curr = curr.next;




        }



        return head;

    }

    public static void main(String args[])
    {


        LinkedListClass l1 = new LinkedListClass();
        l1.insertAtEnd(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.insertAtEnd(6);
        l1.insertAtEnd(7);
        l1.insertAtEnd(8);
        l1.insertAtStart(10);

        l1.display();

        System.out.println(l1.first.data);
        Node result = deleteEven(l1.first);
        Node current = result;
        System.out.println("\n\t ***LINKED LIST NODES***\n\n From first to last\n");
        while(current!=null)
        {
            current.displayNode();
            current=current.next;
        }
        System.out.println("\n");



    }

    public void display()
    {


    }

}
