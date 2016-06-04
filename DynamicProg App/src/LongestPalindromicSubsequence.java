import static javafx.scene.input.KeyCode.T;

/**
 * Created by Nathan on 5/3/2016.
 */
public class LongestPalindromicSubsequence {



    LongestPalindromicSubsequence(int size)
    {
        int[][] T= new int[size-1][size-1];
    }


    /**
     * using top down approach  - using recursion
     *
     * ysing this approavh some of the repeated sub problems end up being calculated again
     * @param start
     * @param length
     * @param str
     */
    int findMaxLPS(int start, int length,String str, int[][] T)
    {

        int i = start;
        int j = start+length-1;


        if(length==1)
        {
            System.out.println(" i and j values ="+i+" : "+j );
            T[i][j] =1;
            return T[i][j];
        }
        if(length==0)
        {
            System.out.println(" i and j values ="+i+" : "+j );
            T[i][j] =0;
            return T[i][j];
        }
        if(str.charAt(i)==str.charAt(j))
        {

            T[i][j]= 2+ findMaxLPS(start+1,length-2,str,T);
            System.out.println(" i and j values ="+i+" : "+j );
            return T[i][j];
        }

        T[i][j]= Math.max(findMaxLPS(start, length-1,str,T),findMaxLPS(start+1, length-1, str,T));
        System.out.println(" i and j values ="+i+" : "+j );
        return T[i][j];


    }

    int findMaxLSPusingDP(String str)
    {
        int size = str.length();

        int[][] T = new int[size][size];
        for(int i=0; i<size; i++)
            T[i][i]=1;

        //outer loop will be for length and inner loop for the starting points)
        for(int len =2; len< size+1;len++)
        {
            for(int startPt = 0; startPt<size-len+1; startPt++)
            {
                int endPt = startPt+len-1;
                if(str.charAt(startPt)== str.charAt(endPt) && len==2)
                {
                    T[startPt][endPt]= 2;
                }
                else if(str.charAt(startPt)== str.charAt(endPt))
                {
                    T[startPt][endPt]= 2+T[startPt+1][endPt-1];
                }
                else
                {
                    T[startPt][endPt]= Math.max(T[startPt][endPt-1],T[startPt+1][endPt]);
                }







            }
        }
        return T[0][size-1];
    }

    public static void main(String args[])
    {
        LongestPalindromicSubsequence lsp;
//        String stringValue = "AGBDBA";
        String stringValue = "GEEKFORGEEKS";
        lsp = new LongestPalindromicSubsequence(stringValue.length());

        int[][] T = new int[stringValue.length()][stringValue.length()];
//        int maxLSP =lsp.findMaxLPS(0,stringValue.length(),stringValue,T);
        int maxLSP =lsp.findMaxLSPusingDP(stringValue);
        System.out.println(" Max LSP is "+maxLSP);
    }
}
