
public class LinkedList 
{	
	Node first;
	
	/**
	 * constructor for LinkedList
	 */
	public LinkedList() 
	{
		first=null;
	}
	
	/**
	 * true if list is empty
	 * @return
	 */
	public boolean isEmpty()
	{
		return(first==null);
	}
	
	// insert at the start
	public void insertAtStart(int data)
	{
		Node newLink= new Node(data);
		newLink.next=first;
		first=newLink;
//		System.out.println(" at insert "+newLink.data+" now first is "+first.data);
	}
	
	// insert at the end
	public void insertAtEnd(int data)
	{
		//create new node
		Node newLink = new Node(data);
		// need a variable of type node for traversal
		
		Node current = first;
		if(first==null)
		{
			
			first=newLink;
			current=newLink;
			System.out.println(" "+first.data+"::"+newLink.data);
		}
		
//		System.out.println("first :"+first.data +" "+newLink.data+" "+current.data);
		//if no element present then this node becomes first
		else
		{
			//traverse till we reach the end
			while(current.next!=null)
			{
				
				
					System.out.println(" current "+current.data);
					System.out.println(current.next);
					current = current.next;
				
			}
			//once we reach the end of the list add new node
			current.next=newLink;
			System.out.println("hello "+current.next.data);
		}
			
			
		
		
		
	}
	
	// insert after a certain position
	public void insertAfterKey(int key, int data)
	{
		//create new node to insert
		Node newLink = new Node(data);
		//create a current 			
		Node current = first;
		// find the node
		while(current.data!=key)
		{
			//key not found
			if(current.next==null)
			{
				System.out.println("key not found");
			}
			else
			{
				current = current.next;
				
			}
		}
		//insert the node
		newLink.next = current.next;
		current.next = newLink;
	}
	
	
	//delete at the start and return the element deleted
	public int deleteAtStart()
	{
		Node temp = first;
		first=first.next;
		return temp.data;
	}
	
	//delete at the end 
	
	//delete after a specified location
	
	//display linked list
	public void display()
	{
		Node current = first;
		System.out.println("\n\t ***LINKED LIST NODES***\n\n From first to last\n");
		while(current!=null)
		{
			current.displayNode();
			current=current.next;
		}
		System.out.println("\n");
		
	}
}
