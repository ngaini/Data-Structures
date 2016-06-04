import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Nathan on 5/28/2016.
 */
public class Graph{



        int V;

        // this is like an array list
        LinkedList<Integer> adj[];

        Graph(int v)
        {
            V =v;

            adj = new LinkedList[v];
            for(int i =0;i<v;i++)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int w)
        {
            adj[v].add(w);
        }

        void DFS(int v)
        {
            boolean[] visited = new boolean[V];

            DFSUtil(v, visited);


        }


        void DFSUtil(int v,boolean[] visited)
        {
            // mark node v as visited
            visited[v] = true;
            //display node v
            System.out.println(" "+v);
            //see if it has neighbours
            Iterator<Integer> i = adj[v].listIterator();
            // if neighbour is present and is not visited then call dfsUtil again
            while(i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                    DFSUtil(n, visited);

            }
        }

        public static void main(String args[])
        {
            Graph g = new Graph(4);

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
