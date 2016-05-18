import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nathan on 5/17/2016.
 */
public class BSTApp {
    TreeNode root;


    BSTApp()
    {
        root = null;
    }

    BSTApp(int data)
    {
        TreeNode newNode = new TreeNode(data);
    }


    void printInorder(TreeNode root)
    {
        if(root!= null)
        {
            System.out.println(" "+root.data);
            printInorder(root.left);
            printInorder(root.right);

        }
    }


//    String repeatedWord(String str)
//    {
//        String[] splited = str.split(" ");
//        String notpresent = "no";
//        HashSet<Character> set = new HashSet<>();
//        for(int i = 0; i<splited.length; i++ )
//        {
//            if(set.contains(splited[i]))
//            {
//               return splited[i];
//            }
//
//            set.add(str.charAt(i));
//        }
//
//        return notpresent;
//    }


    /**
     * method for finding the max value in a Binary tree
     * @param root
     * @return
     */
    int max=-1;
    int maxValue(TreeNode root)
    {

        if(root != null)
        {
            int root_val = root.data;
            int left = maxValue(root.left);
            int right = maxValue(root.right);
            if(left>right)
                max = left;
            else
                max = right;
            if(root_val> max ) max = root_val;

        }

        return max;
    }

    /**
     * find the top view of Tree can be BST or Binary Tree
     * @param root
     */

    void topView(TreeNode root)
    {
        if(root == null) return;
        HashSet<Integer> set = new HashSet<>();
        Queue<QItem> q = new LinkedList<>();
        q.add(new QItem(root, 0));
        while(!q.isEmpty())
        {
            QItem temp = q.remove();
            int hd = temp.hd;
            TreeNode n = temp.node;
            if(!set.contains(hd))
            {
                set.add(hd);
                System.out.print(" "+temp.node.data);
            }

            if(n.left != null)
                q.add(new QItem(n.left , hd-1));
            if(n.right!= null)
                q.add(new QItem(n.right, hd+1));
        }

    }

    public static void main(String args[])
    {

        BSTApp bst1 = new BSTApp();
        bst1.root = new TreeNode(15);
        bst1.root.right = new TreeNode(30);
        bst1.root.left = new TreeNode(7);
        bst1.root.right.left = new TreeNode(20);
        bst1.root.right.right = new TreeNode(45);
        bst1.root.right.left.right = new TreeNode(25);
        bst1.root.right.left.right.right = new TreeNode(26);
        bst1.root.right.left.right.right.right = new TreeNode(27);

        //test for max value in binary tree
        System.out.println("Max value of the tree is "+ bst1.maxValue(bst1.root));

        //test for top view of a tree
        bst1.topView(bst1.root);


    }
}
