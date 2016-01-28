/**
 * Class for the application
 * @author Nathan
 *
 */
public class LinkedListApp {

	public static void main(String[] args) 
	{
		LinkedList llOblect = new LinkedList();
		
//		
//		
//		
//		while(!llOblect.isEmpty())
//		{
//			int value;
//			value =llOblect.deleteAtStart();
//
//			System.out.println("Deleted :"+value);
//			llOblect.display();
//		}
		llOblect.display();
		//
		llOblect.insertAtEnd(40);
		llOblect.display();
		llOblect.insertAtStart(10);
		llOblect.insertAtStart(20);
		llOblect.insertAtStart(30);
		llOblect.insertAtEnd(50);
		llOblect.display();
//		System.out.println("hello");
		llOblect.insertAfterKey(50, 55);
		
		llOblect.display();
		llOblect.deleteAtEnd();
		llOblect.display();
		llOblect.deleteAtEnd();
		llOblect.display();
		llOblect.deleteAtEnd();
		llOblect.display();
		llOblect.deleteAtEnd();
		llOblect.display();
		llOblect.deleteAtEnd();
		llOblect.display();
		llOblect.deleteAtEnd();
		llOblect.display();
		llOblect.deleteAtKey(50);
		llOblect.insertAtEnd(40);
		llOblect.deleteAtKey(50);
		llOblect.insertAtStart(10);
		llOblect.insertAtStart(20);
		llOblect.insertAtStart(30);
		llOblect.insertAtEnd(50);
		
		llOblect.display();
		llOblect.insertAtStart(25);
		llOblect.display();
		llOblect.deleteAtKey(50);
		llOblect.display();
		
	}

}
