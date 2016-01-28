/**
 * class for doing all operations on Doubly linked list
 * 
 * @author Nathan
 *
 */
public class DoublyLinkedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" hey0");
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.display();
		 
		System.out.println(" hey");
		//
		dll.insertAfterKey(10, 15);
		dll.insertAtStart(10);
		dll.display();
		dll.insertAfterKey(110, 95);
		dll.display();

		dll.insertAtEnd(15);
		dll.display();
		dll.insertAtStart(5);
		dll.display();
		dll.deleteAtStart();
		dll.display();
		dll.deleteAtEnd();
		dll.display();
		dll.deleteAtStart();
		dll.display();
		dll.deleteAtStart();
		dll.display();
		dll.insertAfterKey(10, 15);
		dll.insertAtStart(10);
		dll.display();
		dll.insertAfterKey(10, 95);
		dll.display();

		dll.insertAtEnd(15);
		dll.display();
		dll.insertAtStart(5);
		dll.display();
		dll.insertAtStart(51);
		dll.display();
		dll.deleteAtStart();
		dll.display();
		dll.deleteAtEnd();
		dll.display();
		dll.deleteAtEnd();
		dll.display();
		dll.deleteAtEnd();
		dll.display();
		dll.deleteAtEnd();
		dll.display();
		dll.insertAfterKey(10, 15);
		dll.insertAtStart(10);
		dll.display();
		dll.insertAfterKey(10, 95);
		dll.display();

		dll.insertAtEnd(15);
		dll.display();
		dll.insertAtStart(5);
		dll.display();
		dll.insertAtStart(51);
		dll.display();
		

	}

}
