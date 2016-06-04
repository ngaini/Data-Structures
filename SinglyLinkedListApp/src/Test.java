/**
 * Created by Nathan on 4/15/2016.
 */
public class Test {

    public static void main(String args[])
    {
        SinglyLL s1 = new SinglyLL();
        s1.insertAtStart(10);
        s1.insertAtStart(20);
        s1.insertAtEnd(30);
        s1.insertAtEnd(34);
        s1.insertAtEnd(32);
        s1.print();
        Node n= s1.find(20);
        System.out.println(n.data);
        s1.delete(34);

        s1.insertAtKey(39,32);
        s1.print();
        s1.swappingNodes(10,32);
        s1.swappingNodes(32,39);
        s1.print();

        s1.reverseList();

        s1.print();
        s1.head.next.next.next.next.next = s1.head.next.next;
        int loop = s1.detectLoop();
        if(loop ==1)
        {
            System.out.println(" loop present");
            s1.print();
        }
    }
}
