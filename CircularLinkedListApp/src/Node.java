/**
 * class for CLL node
 * @author Nathan
 *
 */
public class Node {
	int data;
	Node next;
	
	//constructor for node
	Node(int data)
	{
		this.data = data;
		this.next = this; // for node to point to itself
//		System.out.println(this.data+" :: "+this.next+ " ::"+this);
	}
	// display single node
	public void displayNode()
	{
		
		System.out.print(" "+data);
		
	}
}
