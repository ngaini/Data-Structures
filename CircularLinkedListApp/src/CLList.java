/**
 * Class for CLL 
 * @author Nathan
 *
 */
public class CLList {
	
	Node first;
	
	public CLList() {
		// TODO Auto-generated constructor stub
		first = null;
		
	}
	
	//insert at last
	public void insertAtEnd(int data)
	{
		Node newLink = new Node(data);
		
		//node for traversal
		Node current = first;
		System.out.println(current+"::"+current.next+" ||"+first+"::"+first.next);
		if(first == null)
		{
			first = newLink;
			return;
		}
		while(current.next!=first)
		{
			current = current.next;
		}
		newLink.next = current.next;
		current.next = newLink;
		
	}
	
	//insert at start
	
	//delete at last
	
	//delete at start

}
