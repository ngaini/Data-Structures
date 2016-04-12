/**
 * Created by Nathan on 3/28/2016.
 * class for demonstrating merging of two balanced search trees into one BST
 */
public class MergeBST {

    private Node root;

    MergeBST()
    {
        root = null;

    }


    public int[] mergingArrays(int[] array1, int[] array2, int m, int n)
    {
        int[] mergedArray = new int[m+n];
        int k =0, j=0,i=0;

        while(i<m && j<n)
        {
            if(array1[i]<array2[j])
            {
                mergedArray[k]=array1[i];
                i++;
                k++;
            }
            else
            {
                mergedArray[k]= array2[j];
                j++;
                k++;
            }

        }
        while(i<m)
        {
            mergedArray[k]=array1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            mergedArray[k]= array2[j];
            j++;
            k++;
        }
        return mergedArray;
    }


    public Node mergeTrees(Node root1, Node root2)
    {
        int[] array1 = new int[20];
        int i =0;
        sortInorder(root1,array1,i);

        int[] array2 = new int[20];
        int j=0;
        sortInorder(root2,array2,j);

        int[] mergedArray = mergingArrays(array1,array2,array1.length, array2.length);


        return arraytoTree(mergedArray, 0, mergedArray.length-1);
    }

    public void sortInorder(Node root, int[] inorderArray, int a)
    {
        if(root!= null)
        {
            sortInorder(root.left,inorderArray, a);
            inorderArray[a]= root.data;
            a++;
            sortInorder(root.right,inorderArray,a);
        }

    }

    public Node arraytoTree(int[] mergedArray, int start, int end)
    {
        if(start>end)
            return null;

        int mid = ((start+end)/2);
        Node root = new Node(mergedArray[mid]);

        root.left = arraytoTree(mergedArray, start,mid-1);
        root.right= arraytoTree(mergedArray, mid+1, end);
        return root;
    }

    public void printInorder(Node root)
    {
        if(root!= null)
        {
            printInorder(root.left);
            System.out.println(root.data);
            printInorder(root.right);
        }

    }
}
