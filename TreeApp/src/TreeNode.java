import sun.reflect.generics.tree.Tree;

/**
 * Created by Nathan on 5/17/2016.
 */
public class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode()
    {
        this.right = null;
        this.left = null;

    }

    TreeNode(int data)
    {
        this.data = data;
        this.right = null;
        this.left = null;

    }
}
