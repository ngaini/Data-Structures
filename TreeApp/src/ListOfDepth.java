import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nathan on 6/29/2016.
 * List of Depth Problem CCI 4.3
 * Own method using level-order/ BFS approach
 */
public class ListOfDepth {

    TreeNode root;
    ListOfDepth()
    {
        root = null;
    }
    HashMap createListOfDepth(TreeNode root)
    {
        HashMap<Integer,LinkedList<Integer> > depthList = new HashMap<Integer, LinkedList<Integer>>();

        if(root == null) return depthList;

        int height =0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(root);

        while(!q.isEmpty())
        {
            int count = q.size();
            depthList.put(height,new LinkedList<Integer>());

            for(int i = 0; i<count; i++)
            {

                TreeNode n = q.remove();
                int data = n.data;
                depthList.get(height).add(data);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);


            }
            height++;

        }
        return depthList;
    }

    void printDepthList(HashMap<Integer, LinkedList<Integer>> list)
    {
        if(list.size()==0) System.out.println(" Tree is empty");
        for(int i =0; i<list.size(); i++)
        {
            System.out.print(" level "+i+" :");
            for(Integer k : list.get(i))
            {
                System.out.print(" "+k);
            }
            System.out.println();

        }

    }

    public static void main(String args[])
    {
        ListOfDepth l1 = new ListOfDepth();
        l1.root = new TreeNode(10);
        l1.root.left = new TreeNode(5);
        l1.root.right = new TreeNode(20);
        l1.root.right.right = new TreeNode(30);
        l1.root.right.right.right = new TreeNode(40);
        l1.root.left.left = new TreeNode(3);
        l1.root.left.right = new TreeNode(7);
        l1.printDepthList(l1.createListOfDepth(l1.root));
    }
}
