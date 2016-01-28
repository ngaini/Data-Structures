
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
			System.out.println("insert : L ist was empty");
			first = newLink;
			last = newLink;
			System.out.println(first+ "::"+last);
			return;
		}
//		System.out.println("out of if ");
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
			System.out.println(" List is empty, inserted at the end");
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
		// list is empty
		if(first == null)
		{
			System.out.println("\ncannot find key value "+key+" list is empty");
			return;
		}
		
		//check if key is present , only if key is found create node
		while(current.data!=key)
		{
			System.out.println("here ->"+current.data);
			//end of the list
			
			if(current.next==null)
			{
				System.out.println("here1");
				System.out.println("key not found");
				return;
			}
			current = current.next;
			System.out.println("here4");
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
		if(first.next==null)
		{
			first = last = null;
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
	public void deleteKey(int key)
	{
		//create node for traversal
		Node current = first ;
		while(current.data!=key)
		{
			//end of the list
			if(current == null)
			{
				System.out.println(key+" key not found");
				return;
			}
			current = current.next;
		}
		// if node is the first node
		if(current == first)
		{
			
			first = first.next ;
			first.previous = null;
			current.next = null;
//			return;
		}
		// if last node
		else if(current == last)
		{
			last = last.previous;
			last.next = null;
			current.previous = null;
//			return;
		}
		// any other node
		else
		{
			current.previous.next = current.next;
			current.next.previous = current.previous;
			current.next = null;
			current.previous = null;
		}
	}
	//display list method
	public void display()
	{
		Node current = first;
		
		int count = 0;
		System.out.println("\n\n ***D Lsit Elements are \n ");
		while (current!=null) 
		{
			
//			System.out.println("\n curr.next"+current.next+ " first.next ::"+first.next+ " last.next ::"+last.next+"\n first:"+first+" :: last:"+last  );
//			
			System.out.print(":: "+(count+1)+" :");
			current.displayNode();
			current = current.next;
			count++;
			
		}
	}
	
	
}
