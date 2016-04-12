/**
 * Created by Nathan on 3/28/2016.
 */
public class BST {

    private Node root;

    BST()
    {
        root = null;
    }

    public void  insert(int data)
    {
        root = insertNode(root,data);
    }
    public Node insertNode(Node root, int key)
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        if(root.data > key)
        {
            root.left = insertNode(root.left, key );
        }
        else
        {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    public void inorder()
    {
        printInorder(root);
    }

    public void printInorder(Node root)
    {
        if(root!=null)
        {
            printInorder(root.left);
            System.out.println(" "+root.data);
            printInorder(root.right);
        }
    }

    public void delete(int key)
    {
        root = deleteNode(root,key);
    }

    public int minValue(Node root)
    {
        if(root!=null)
        {
            while(root.left!= null)
            {
                root = root.left;
            }
        }

        return root.data;
    }

    public Node deleteNode(Node root,int key)
    {
        if(root == null)
        {
            return root;
        }
        if(root.data> key)
        {
            root.left = deleteNode(root.left, key);

        }
        else if(root.data< key)
        {
            root.right = deleteNode(root.right,key);
        }
        else
        {
            if(root.left == null)
            {
                return root.right;
            }
            else if (root.right== null)
            {
                return root.left;
            }
            int minValue = minValue(root.right);
            root.data = minValue;
            root.right = deleteNode(root.right, root.data);
        }
        return root;

    }



}
