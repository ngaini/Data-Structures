
public class SinglyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList sLL = new SinglyLinkedList();
		
		sLL.printList();
		sLL.insertAfterKey(150, 10);
		sLL.insertAtEnd(10);
		sLL.deleteAtStart();
		sLL.insertAtEnd(11);

		sLL.deleteAtEnd();
		
		sLL.insertAtStart(15);
		sLL.deleteAtEnd(151);
		sLL.deleteAtEnd(15);
		
		
		sLL.printList();
		
	}

}
