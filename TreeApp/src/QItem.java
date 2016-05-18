/**
 * Created by Nathan on 5/17/2016.
 */
public class QItem {

    int hd;
    TreeNode node;

    QItem(TreeNode node, int distance)
    {
        this.hd = distance;
        this.node = node;

    }
}
