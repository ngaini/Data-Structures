import java.util.ArrayList;
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


    boolean searchingWithRecursion(TreeNode root, int data)
    {
        if(root != null)
        {
            if(root.data == data) return true;
            boolean temp = searchingWithRecursion(root.left, data);

            // if element is found and it is true then return true else recur down the left subtree.
            if(temp)
               return temp;
            else
                return searchingWithRecursion(root.right,data);


        }
        return false;
    }


    boolean searchingWithoutResursion(TreeNode root, int data)
    {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp = q.remove();
            if(temp.data == data) return true;
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }

        return false;

    }
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



//    int[] path = new int[10];
    boolean hasPath(TreeNode root, int sum,int index, ArrayList<Integer> path)
    {

        //incase the root is null
        if(root == null )
        {
//            sum=sum+ path[index-1];
            index--;

            return false;
        }
//        path[index]=root.data;
        path.add(root.data);
        int subSum = sum - root.data;
        if(root.left==null && root.right == null && subSum==0)
        {
            print(path, index);
            return true;
        }
        if(root.left==null && root.right == null && subSum>0)
        {
            path.remove(path.size()-1);
            return false;
        }


            return (hasPath(root.left, subSum, index+1,path)|| hasPath(root.right, subSum,index+1,path));








    }

//    void print(int[] arrayName, int index)
    void print(ArrayList<Integer> arrayName, int index)
    {
        for(int i=0;i<index+1;i++) {
            System.out.print(" " + arrayName.get(i));


//            System.out.print(" "+arrayName[i]);
        }
    }
    public static void main(String args[])
    {

        BSTApp bst1 = new BSTApp();
        bst1.root = new TreeNode(15);
        bst1.root.right = new TreeNode(30);
        bst1.root.left = new TreeNode(7);
        bst1.root.left.right = new TreeNode(9);
        bst1.root.left.left = new TreeNode(3);
        bst1.root.right.left = new TreeNode(20);
        bst1.root.right.right = new TreeNode(45);
        bst1.root.right.left.right = new TreeNode(25);
        bst1.root.right.left.right.right = new TreeNode(26);
        bst1.root.right.left.right.right.right = new TreeNode(27);

        //test for max value in binary tree
//        System.out.println("Max value of the tree is "+ bst1.maxValue(bst1.root));

        //test for top view of a tree
//        bst1.topView(bst1.root);

//        if(bst1.searchingWithRecursion(bst1.root, 45 ))
//            System.out.println("Element found");
//        else
//            System.out.println("Element not found");

//        if(bst1.searchingWithoutResursion(bst1.root, 7 ))
//            System.out.println("Element found");
//        else
//            System.out.println("Element not found");
        ArrayList<Integer> path= new ArrayList<>();
        if(bst1.hasPath(bst1.root,143,0,path))
            System.out.println("There exist a path");
        else
            System.out.println("No path to sum");

    }
}
