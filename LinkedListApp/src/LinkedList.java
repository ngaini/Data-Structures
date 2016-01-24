
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
//			System.out.println(" "+first.data+"::"+newLink.data);
		}
		
//		System.out.println("first :"+first.data +" "+newLink.data+" "+current.data);
		//if no element present then this node becomes first
		else
		{
			//traverse till we reach the end
			while(current.next!=null)
			{
				
				
//					System.out.println(" current "+current.data);
//					System.out.println(current.next);
					current = current.next;
				
			}
			//once we reach the end of the list add new node
			current.next=newLink;
			System.out.println("hello "+current.next.data+" ::"+newLink.next);
		}
			
		
		System.out.println(newLink.next);
		
		
	}
	
	// insert after a certain position
	public void insertAfterKey(int key, int data)
	{
		//create new node to insert
		Node newLink = new Node(data);
		//create a current 			
		Node current = first;
		//if no nodes present
		System.out.println("current "+current.data+" first"+first.data+newLink.next);
		if(first==null)
		{
			current=newLink;
			first=newLink;
			return;
		}
		//else find the node
		while(current.data!=key)
		{
			// check if we reached the end of the list
			//if yes then node is not found
			if(current.next==null)
			{
				System.out.println("node not found");
				return;
			}
			current = current.next;
			
		}
		newLink.next=current.next;
		current.next=newLink;
	}
	
	
	//delete at the start and return the element deleted
	public void deleteAtStart()
	{
		if(first ==null)
		{
			System.out.println(" No Nodes to delete");
			return;
		}
		Node temp = first;
		first=first.next;
		System.out.println(" Deleted :" +temp.data);
	}
	
	//delete at the end 
	public void deleteAtEnd()
	{
		//create node for traversal
		Node current= first;
		Node previous= null;
		//check is lsit is not empty
		if(first==null)
		{
			System.out.println(" No Nodes to delete");
			return;
		}
		//check if only one node is present then delete that node and assign first to null
		
		//traverse till end and delete node
		while(current.next!=null)
		{
			previous =current;
			current = current.next;
		}
		previous.next =null;
		System.out.println(" Delete node :"+current.data);
	}
	
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
