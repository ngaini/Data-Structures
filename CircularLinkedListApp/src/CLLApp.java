
public class CLLApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Node inti= new Node(10);
		
		CLList cll = new CLList();
		
		cll.display();
		cll.insertAtEnd(10);
		cll.insertAtStart(20);
		cll.insertAtStart(30);
		cll.insertAtEnd(45);
		cll.insertAtEnd(74);
		cll.insertAtStart(50);
		cll.display();
		cll.deleteAtEnd();
		cll.display();
		cll.deleteatStart();
		cll.display();
		cll.deleteatStart();
		cll.display();
		cll.deleteatStart();
		cll.display();
		cll.deleteatStart();
		cll.display();
		cll.deleteAtEnd();
		cll.display();
		cll.deleteAtEnd();
		cll.display();
		cll.deleteatStart();
	
		

	}

}
