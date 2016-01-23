
public class Node 
{
	int data;
	Node next;
	
	
	/**
	 * Constructor for Node
	 * @param data
	 */
	public Node(int data) 
	{
		this.data=data;
		this.next=null;
	}
	
	/**
	 * display a node
	 */
	public void displayNode()
	{
		System.out.print(""+data+" ");
	}	
}
