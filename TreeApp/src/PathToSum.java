import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Nathan on 7/1/2016.
 * Geek for geeks question: Path to sum
 *
 */
public class PathToSum {

    int count=0;

    private class Answer
    {
        int count;
        boolean decision;

        Answer()
        {
            count = 0;
            decision = false;
        }

    }

    TreeNode root;


    PathToSum()
    {
        root= null;
    }


    /**
     * returns true if there is a paht from root to leaf having sum
     * @param node
     * @param sum
     * @return
     */
//    boolean hasPath(TreeNode node, int sum)
//    {
////        Answer answer = new Answer();
//        if(node == null)
//        {
////            if(sum ==0)
////            {
////                answer.decision = true;
////                answer.count++;
////            }
//            return sum==0;
//
//
//        }
////            return (sum==0);
//        else
//        {
//            boolean answer = false;
//
//            int subSum  = sum - node.data;
//
//            if(subSum ==0 && node.left == null && node.right == null)
//                return true;
//
////            {
////                answer.decision = true;
////                answer.count++;
////                return answer;
////            }
//
//            if(node.left != null)
//               answer= answer|| hasPath(node.left, subSum);
//
//            if(node.right != null)
//                answer= answer ||hasPath(node.right, subSum);
//
//            return answer;
//
//
//        }
//
//    }

    ArrayList<ArrayList<Integer>> hasPath(TreeNode node, int sum)
    {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
        int currSum =0;
        ArrayList<Integer> currPath = new ArrayList<Integer>();
        findPathToSum(node, sum, currSum, paths, currPath);


        return paths;
    }


    void findPathToSum(TreeNode node, int sum, int currSum, ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> currentPath)
    {
        if(node== null)
            return;

        int newSum = node.data+ currSum;
        if(node.left == null && node.right ==null && newSum == sum )
        {
            ArrayList<Integer> possiblePath = new ArrayList<Integer>(currentPath);
            possiblePath.add(node.data);
            paths.add(possiblePath);
            count++;
            return ;
        }
        else
        {
            ArrayList<Integer> possiblePath = new ArrayList<Integer>(currentPath);
            possiblePath.add(node.data);
            if(node.left != null)
                findPathToSum(node.left, sum, newSum, paths, possiblePath);
            if(node.right != null)
                findPathToSum(node.right, sum, newSum, paths, possiblePath);

        }


    }

    public static void main(String args[])
    {
        PathToSum p1 = new PathToSum();
        p1.root = new TreeNode(40);
        p1.root.left = new TreeNode(15);
        p1.root.right = new TreeNode(60);
        p1.root.right.right = new TreeNode(80);
//        p1.root.right.left = new TreeNode(41);
        p1.root.left.left = new TreeNode(10);
        p1.root.left.right = new TreeNode(20);
        p1.root.left.right.right = new TreeNode(28);
        p1.root.left.right.left = new TreeNode(18);
        p1.root.left.right.right.right = new TreeNode(38);
        ArrayList<ArrayList<Integer>> paths = p1.hasPath(p1.root , 141);

        if(paths!= null)
        {
            for(int i =0; i<paths.size(); i++)
            {
                for(Integer k : paths.get(i))
                    System.out.print(" "+k);
                System.out.println();
            }
        }
        else
            System.out.println("No path having the sum");
        System.out.println(p1.count);

    }


}
