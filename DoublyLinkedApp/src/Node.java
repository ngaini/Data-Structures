/**
 * Class for Node of doubly linked list
 * 
 * @author Nathan
 *
 */
public class Node {
	int data;
	Node next;
	Node previous;

	// Constructor
	Node(int data) {
		this.data = data;
		this.next=null;
		this.previous=null;
	}

	// Display single node
	public void displayNode() {
		System.out.println(" " + data);
	}

}
