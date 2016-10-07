/**
 * Class for node
 * @author Nathan
 *
 */
public class Node {
	int data;
	Node next;
	
	// initialize Node when created
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data =data;
		next =null;
		
	}
	
	// to print a single node
	public void printNode()
	{
		System.out.print(" "+data);
	}
	

}
