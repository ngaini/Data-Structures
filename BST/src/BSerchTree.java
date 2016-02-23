/**
 *  Karumanchi Logic 
 * /
public class BSerchTree {
	
	private Node root;
	private static int max;
	private Node temp; 
	public BSerchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	// insert method
	public void insert(int key)
	{
		root = insertNode(root, key);
	}
	
	//insert Node into BST
	public Node insertNode(Node root, int data)
	{
		if(root == null)
		{
			root = new Node(data);
			
		}
		else if(data< root.data)
		{
			root.left = insertNode(root.left, data);
		}
		else if(data>root.data)
		{
			root.right = insertNode(root.right,data );
		}
		return root;
	}
	
	
	//display
	public void display()
	{	System.out.println("\n\n INORDER :\n Tree Elements are :\n");
		displayTree(root);
		System.out.println("\n");
	}
	public void displayTree(Node root)
	{
		
		if(root== null)
			return;
		else
		{
			
			
			displayTree(root.left);
			System.out.print(root.data+" ");
			displayTree(root.right);
		}
		
		
	}
	
	
	// find max value in tree
	public Node FindMax(Node root)
	{
		
		if(root == null)
		{
			return null;
		}
		else 
		{
			if(root.right== null)
			 return root;
			else return FindMax(root.right);
		}
		
	}
	//delete operation
	public void delete(int key)
	{
		root =deleteNode(root, key);
	}

	private Node deleteNode(Node root, int key) 
	{
		// TODO Auto-generated method stub
		if(root== null)
		{
			System.out.println(" Empty");
			return null;
		}
		if(key< root.data)
		{
			root.left = deleteNode(root.left, key);
		}
		else if(key> root.data)
		{
			root.right = deleteNode(root.right, key);
		}
		else
		{
			// if root has two children
			if(root.left!=null && root.right!=null )
			{
				temp = FindMax(root.left);
				root.data = temp.data;
				// now delete the largest node in the left sub tree
				root.left = deleteNode(root.left, root.data);
			}
			else
			{
				// no child or one child
				if(root.left==null)
				{
					return root.right;
				}
				if(root.right==null)
				{
					return root.left;
				}
			}
		}
		
		return root;
		
	}
	

}
