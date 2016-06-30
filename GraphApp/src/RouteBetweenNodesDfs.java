import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Nathan on 6/28/2016.
 * Rout between Nodes using Dfs method
 *
 */
public class RouteBetweenNodesDfs {

    int noOfVertices;
    ArrayList<ArrayList<Integer>> neighbour;

    RouteBetweenNodesDfs(int n)
    {
        noOfVertices = n ;
        neighbour = new ArrayList<ArrayList <Integer>>();

        for(int i =0 ;i <noOfVertices; i++)
            neighbour.add(new ArrayList<Integer>());

    }

    void addEdge(int u, int v)
    {
        neighbour.get(u).add(v);
    }

    boolean dfs(int source, int destination)
    {
        HashSet<Integer> visited = new HashSet<>();
        return dfsUtil(visited, destination, source);

    }


    boolean dfsUtil(HashSet<Integer> visited, int destination, int node)
    {

        visited.add(node);
        if(destination == node) return true;

        for(Integer i: neighbour.get(node))
        {
            if(!visited.contains(i))
                if(dfsUtil(visited, destination, i))
                    return true;
        }

        return false;
    }

    public static void main(String args[])
    {
        RouteBetweenNodesDfs rbn = new RouteBetweenNodesDfs(4);

        rbn.addEdge(0, 1);
        rbn.addEdge(0, 2);
        rbn.addEdge(1, 2);
        rbn.addEdge(2, 0);
        rbn.addEdge(2, 3);
        rbn.addEdge(3, 3);
        int u,v;
        u=3;
        v=1;
        if(rbn.dfs(u,v))
            System.out.println("Route exists between "+u+" and "+v);
        else
        System.out.println("Route does not exists between "+u+" and "+v);

    }

}
