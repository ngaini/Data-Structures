/**
 * Class for the application
 * @author Nathan
 *
 */
public class LinkedListApp {

	public static void main(String[] args) 
	{
		LinkedListClass llOblect = new LinkedListClass();
		
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
//		llOblect.insertAtEnd(40);
//		llOblect.display();
//		llOblect.insertAtStart(10);
//		llOblect.insertAtStart(20);
//		llOblect.insertAtStart(30);
//		llOblect.insertAtEnd(50);
//		llOblect.display();
////		System.out.println("hello");
//		llOblect.insertAfterKey(50, 55);
//
//		llOblect.display();
//		llOblect.deleteAtEnd();
//		llOblect.display();
//		llOblect.deleteAtEnd();
//		llOblect.display();
//		llOblect.deleteAtEnd();
//		llOblect.display();
//		llOblect.deleteAtEnd();
//		llOblect.display();
//		llOblect.deleteAtEnd();
//		llOblect.display();
//		llOblect.deleteAtEnd();
//		llOblect.display();
//		llOblect.deleteAtKey(50);
//		llOblect.insertAtEnd(40);
//		llOblect.deleteAtKey(50);
//		llOblect.insertAtStart(10);
//		llOblect.insertAtStart(20);
//		llOblect.insertAtStart(30);
//		llOblect.insertAtEnd(50);
//
//		llOblect.display();
//		llOblect.insertAtStart(25);
//		llOblect.display();
//		llOblect.deleteAtKey(50);
//		llOblect.display();

		/**
		 * test for CCI :2.4
		 */
		llOblect.insertAtEnd(3);
		llOblect.insertAtEnd(5);
		llOblect.insertAtEnd(8);
		llOblect.insertAtEnd(5);
		llOblect.insertAtEnd(10);
		llOblect.insertAtEnd(2);
		llOblect.insertAtEnd(1);
		llOblect.display();
//		llOblect.unOrderedPartition(llOblect.first,5);
		llOblect.display(llOblect.orderedPartition(llOblect.first, 5));
//		llOblect.display();
	}

}
