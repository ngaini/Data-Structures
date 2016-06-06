import java.util.HashSet;

/**
 * Created by Nathan on 6/5/2016.
 *
 * Solved according to the problem given on GeekforGeeks
 */

public class BoggleGame {

    HashSet<String> dictionary;
    char boggle[][] = {{'G','I','Z'},{'U','E','K'},{'Q','S','E'}};
    int M, N;
    BoggleGame()
    {
//        String[] dictionary ={"GEEKS","FOR","QUIZ","GO"};
        dictionary = new HashSet<>();
        dictionary.add("GEEKS");
        dictionary.add("FOR");
        dictionary.add("QUIZ");
        dictionary.add("GO");
        dictionary.add("IZ");

        M=3;
        N=3;
    }

    void BoggleSolve()
    {
        boolean[][] visited = new boolean[3][3];
        for(int i = 0; i<M;i++)
            for(int j = 0; j<N;j++)
                visited[i][j]= false;
        String word ="";
        for(int i = 0; i<M;i++)
            for(int j = 0; j<N;j++)
                BoggleUtil(i, j, visited, word);


    }

    void BoggleUtil(int i, int j,boolean[][] visited, String word)
    {
        visited[i][j] = true;
        word += boggle[i][j];

        if(dictionary.contains(word))
            System.out.println(word);


        //left
        if(j-1>=0 && !visited[i][j-1])
        {
            BoggleUtil(i,j-1, visited, word);
        }

        //top left
        if( i-1>= 0 && j-1 >=0 && !visited[i-1][j-1])
        {
            BoggleUtil(i-1, j-1, visited, word);
        }

        //top
        if(i-1>=0 && !visited[i-1][j])
        {
            BoggleUtil(i-1,j, visited, word);
        }

        //top right
        if(i-1>=0 && j+1<N && !visited[i-1][j+1])
        {
            BoggleUtil(i-1,j+1, visited, word);
        }

        //right
        if(j+1<N && !visited[i][j+1])
        {
            BoggleUtil(i,j+1, visited,word);
        }

        //bottom right
        if(i+1<M && j+1<N && !visited[i+1][j+1])
        {
            BoggleUtil(i+1, j+1,visited, word);
        }

        //bottom
        if(i+1<M && !visited[i+1][j])
        {
            BoggleUtil(i+1, j, visited, word);
        }

        //bootom left
        if(i+1<M && j-1>=0 && !visited[i+1][j-1])
        {
            BoggleUtil(i+1, j-1, visited, word);
        }

        word = word.substring(0, word.length()-1);
        visited[i][j]= false;

    }


    public static void main(String args[])
    {
        BoggleGame b = new BoggleGame();
        b.BoggleSolve();


    }

}
