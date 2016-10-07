/**
 * Class for Singly linked list
 * @author Nathan
 *
 */
public class SinglyLinkedList {
	Node first;
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		 first = null;
		
	}
	// display list
//	public void printList()
//	{
//		Node current = first;
//		
//		if (current== null)
//		{
//			System.out.println(" List is emplty");
//			return;
//			
//		}
////		if(first.next == null)
////		{
////			current.printNode();
////			System.out.println();
////			return;
////		}
////		while(current!=null)
////		{
////			current.printNode();
////			current = current.next;
////		}
////		for(i=0, curr )
//		
//		while(current!=null)
//		{
//			current.printNode();
//			if(current.next!=null)
//			{
//				System.out.print("=======================================");
//				return;
//				
//			}
////			else
////			{
//				
//				current = current.next;
////			}
//				
//			
//				
//		}
//		
//		
//	}
	
	public void printList()
	{
		Node current = first;
		System.out.println("\n\t ***LINKED LIST NODES***\n\n From first to last\n");
		while(current!=null)
		{
			current.printNode();
			current=current.next;
		}
		System.out.println("\n");
		
	}
	
	// insert at start 
	public void insertAtStart(int data)
	{
		Node newNode = new Node(data);
//		if(first==null)
//		{
//			System.out.println(" List is empty "+data);
//			first = newNode;
////			return;
//		}
//		else 
//		{
			newNode.next = first;
			first = newNode;
//		}
		
	}
	
	//insert at end
	public void insertAtEnd(int data) 
	{
		Node newNode = new Node(data);
		Node current = first;
		if(current==null)
		{
			System.out.println(" List is empty, Inserting "+data );
			first = newNode;
			return;
		}
		/**
		 * this case should handle even when there is one node available or for more than one node
		 */
		while(current.next!=null)
		{
			current = current.next;
		}
		
			current.next = newNode;

		
		
	}
	
	
	// insert at after key
	public void insertAfterKey(int data, int key)
	{
		Node newNode = new Node(data);
		Node current = first;
		
		if(first== null)
		{
			System.out.println("List Empty!!");
			return;
		}
		while(current!=null)
		{
			if(key==current.data)
			{
				System.out.println(" Key found !!\n");
				newNode.next = current.next;
				current.next = newNode;
			}
			else
			{
				if(current.next==null)
				{
					System.out.println(" Could not find key in the list\n");
				}
				else
				{
					current= current.next ;
					
				}
			}
		}
		
	}
	
	//insert after a position
	
	// delete at start
	public void deleteAtStart()
	{
		if(first== null)
		{
			System.out.println(" Cannot Delete, List Empty");
		}
//		if(first.next == null)
//		{
//			first = null;
//			System.out.println(" Deleted the only node , now list is empty");
//		}
		/**
		 * this works when one node is there, tested
		 * 
		 */
		else
		{
			System.out.println("deleted "+first.data);
			first = first.next;
			
		}
	}
	
	//delete at key
	public void deleteAtEnd(int key)
	{
		Node current = first;
		Node previous= null;
		
		if(first== null)
		{
			System.out.println(" Cannot Delete, List Empty");
		}
		/**
		 * didn work work even when one node is available
		 * had to add case to see if first.next was null
		 */
		else
		{
			while(current.data!=key)
			{
//				if(key == current.data)
//				{
//					System.out.println("deleted "+current.data);
//					previous.next = current.next;
//					current.next = null;
//				}
				if(current.next== null)
				{
					System.out.println(" Deletion not possible as key is not present");
					return;
				}
				
					previous = current;
					current = current.next;
				
				
			}
			if(first.next == null)
			{
				System.out.println("deleted "+current.data);
				first=null;
				return;
			}
			previous.next = current.next;
			current.next = null;
		}
	}
	
	//delete at end
	public void deleteAtEnd()
	{
		Node current = first;
		Node previous = null;
		
		 if(first == null)
		 {
			 System.out.println(" List Empty, Deletion not possible");
		 }
		 else if(first.next==null)
		 {
			 System.out.println("deleted "+current.data);
			 first=null;
			 
		 }
		 /*
		  * 
		  * didnt handle in case when one node is present
		  * had to add case to see if first.next was null
		  */
		 else
		 {
			 
			 while(current.next!= null)
			 {
				 previous = current;
				 current = current.next;
			 }
			 System.out.println("deleted "+current.data);
			 previous.next = current.next;
			 current.next = null;
		 }
	}
	
	
	

}
