import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by Nathan on 6/3/2016.
 */
public class Dfs1 {

    int noOfVertices;
    LinkedList<Integer>[] adj;



//    Dfs1(int v)
//    {
//        noOfVertices = v;
//        adj = new LinkedList[v];
//
//        for(int i=0;i<v; i++)
//            adj[i] = new LinkedList<Integer>();
//
//
//    }


//    void addEdge(int v, int w)
//    {
//        adj[v].add(w);
//    }

//    void DFS(int startVertex)
//    {
//        boolean[] visited = new boolean[noOfVertices];
//        for(int i = 0; i<noOfVertices;i++)
//            visited[i] = false;
//
//        DFSUtil(startVertex, visited);
//    }
//
//    void DFSUtil(int vertex, boolean[] visited)
//    {
//        visited[vertex] = true;
//        System.out.print(" "+vertex);
//
//        for(Integer k : adj[vertex])
//        {
//            if(!visited[k])
//            {
//                DFSUtil( k, visited);
//            }
//
//
//        }
//
//
//    }





    ArrayList<ArrayList<Integer>> neighbours;

    Dfs1(int v)
    {
        noOfVertices = v;
        neighbours = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<noOfVertices; i++)
            neighbours.add(new ArrayList<Integer>());



    }


    void DFS(int v)
    {
//        boolean[] visited = new boolean[noOfVertices];
//        for(int i = 0; i<noOfVertices; i++)
//            visited[i]= false;
        HashSet<Integer> visited = new HashSet<>();
        DFSUtil(v , visited);

    }

    void DFSUtil(int v, HashSet<Integer> visited)
    {

        visited.add(v);
        System.out.print(" "+v);
        for (Integer i : neighbours.get(v))
        {
            if(!visited.contains(i))
                DFSUtil(i , visited);
        }


    }


    void addEdge(int v, int w)
    {
        neighbours.get(v).add(w);
    }

    public static void main(String args[])
    {
        Dfs1 g  = new Dfs1(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.print("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(2);


    }
}
