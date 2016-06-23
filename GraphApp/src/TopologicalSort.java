import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by Nathan on 6/14/2016.
 */
public class TopologicalSort {

    private ArrayList<ArrayList<Integer>> adj ;
    private int noOfVertices;

    TopologicalSort(int v)
    {
        noOfVertices = v;
        adj = new ArrayList<>();
        for(int i=0; i<noOfVertices;i++)
            adj.add(new ArrayList<Integer>());
    }

    void addEdge(int v, int w)
    {
        adj.get(v).add(w);
    }

    void topologicalSort()
    {

        HashSet<Integer> visited = new HashSet<Integer>();
        Stack<Integer> topoSortStack = new Stack<Integer>();
        for(int i=0;i<noOfVertices;i++)
        {
            // prevent the same problem to be repeated again
            if(!visited.contains(i))
                topologicalSortUtil(i,visited, topoSortStack);
        }

        while(!topoSortStack.isEmpty())
            System.out.print(" "+topoSortStack.pop());
        System.out.println();
    }

    void topologicalSortUtil(int vertex, HashSet visited, Stack stack)
    {
        visited.add(vertex);

        for(Integer neighbourOfVertex: adj.get(vertex))
        {
            if(!visited.contains(neighbourOfVertex))
                topologicalSortUtil(neighbourOfVertex,visited,stack);
        }

        stack.push(vertex);
    }

    public static void main(String args[])
    {
        TopologicalSort t1 = new TopologicalSort(6);
        t1.addEdge(5, 2);
        t1.addEdge(5, 0);
        t1.addEdge(4, 0);
        t1.addEdge(4, 1);
        t1.addEdge(2, 3);
        t1.addEdge(3, 1);
        System.out.println(" Topological sort for the graph ");
        t1.topologicalSort();


    }
}
