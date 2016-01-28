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
	public void insertAtStart(int data)
	{
		Node newLink = new Node(data);
		Node current = first ;
		// check if list empty
		if(first == null)
		{
			first = newLink;
			return;
		}
		// traverse untill the last node
		while(current.next!= first )
		{
			current = current.next ;
			
		}
		// inset oprations
		newLink.next = current.next;
		current.next = newLink;
		first =newLink;
		
	}
	
	//delete at last
	public void deleteAtEnd()
	{
		//create curr and prev for traversal
		Node current = first;
		Node previous = first;
		//check if list empty
		if(first ==null)
		{
			System.out.println("List empty");
			return;
		}
		
		
		//check if list has only one node
		if(first.next == first)
		{
			first = null;
		}
		
		//traverse
		while(current.next!= first)
		{
			previous = current;
			current = current.next;
		}
		//deletion operation
		previous.next = current.next;
		current.next = null;
	}
	
	//delete at start
	public void deleteatStart()
	{
		//node for traversal
		Node current = first;
		//temp node
		Node temp = first;
		// if list empty
		if(first ==null)
		{
			System.out.println("List empty");
			return;
		}
		
		// traverse till end
		while(current.next!=first)
		{
			current = current.next;
		}
		//delete first node
		current.next = first.next;
		first = first.next;
		temp.next = null;
	}
	
	//display List
	public void display()
	{
		Node current = first ;
		
		if(first == null)
		{
			System.out.println("List empty , nothing to display");
			return;
		}
		if(first.next == first)
		{
			current.displayNode();
			return;
		}
		
		while(current.next!=first)
		{
			current.displayNode();
		}
		
	}
}
