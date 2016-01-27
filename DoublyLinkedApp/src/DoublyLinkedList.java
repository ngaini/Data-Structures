
public class DoublyLinkedList {
	
	Node first ;
	Node last;
	
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		first=null;
		last=null;
		
	}
	
	//insert at first
	public void insertAtStart(int data)
	{
		//create node
		Node newLink= new Node(data);
		//check if list is empty
		if(first==null)
		{
			first = newLink;
			last = newLink;
			System.out.println("List is empty");
			return;
		}
		newLink.next = first;
		first.previous = newLink;
		first =newLink;
		
	}
	
	//insert at last
	public void insertAtEnd(int data)
	{
		//create node
		Node newLink = new Node(data);
		
		//check if node is empty
		if(first==null)
		{
			//new node is first and last
			first= newLink;
			last = newLink;
			System.out.println(" Lis is empty");
		}
		last.next=newLink;
		newLink.previous =last;
		last = newLink;
	}
	
	//insert after key
	public void insertAfterKey(int key, int data)
	{	
		//node for traversal 
		Node current = first;
		//check if key is present , only if key is found create node
		while(current.data!=key)
		{
			//end of the list
			if(current==null)
			{
				System.out.println("key not found");
				return;
			}
			current = current.next;
			//last node's current.next will be null 
		}
		//create a new node
		Node newLink = new Node(data);
		
		//if after last node then last needs to change
		if(current==last)
		{	
			current.next =newLink;
			newLink.previous = current;
			last = newLink;
			return;
		}
		newLink.next = current.next;
		current.next.previous =newLink;
		current.next =newLink;
		newLink.previous = current;
		
		
	}
	
	
	//delete at first
	public void deleteAtStart()
	{
		//check if list is empty
		if(first == null)
		{
			System.out.println(" empty");
			return;
		}
		Node temp = first;
		first = first.next;
		temp.next= null;
		first.previous = null;
	}
	
	//delete at last
	public void deleteAtEnd()
	{
		//check if list is empty
		if(first == null)
		{
			System.out.println("empty");
			return;
		}
		Node temp = last;
		last = last.previous;
		last.next = null;
		temp.previous = null;
		
	}
	//delete a key
	
	//display list method
	public void display()
	{
		Node current = first;
		while (current!=last) 
		{
			System.out.println("D Lsit Elements are \n ");
			current.displayNode();
			current = current.next;
		}
	}
	
	
}
