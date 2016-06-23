/**
 * Created by Nathan on 6/14/2016.
 */
public class FloodFill {

    int rowMax;
    int colMax;

    FloodFill(int rowMax, int colMax)
    {
        this.rowMax =rowMax;
        this.colMax = colMax;

    }

    void floodFill(int x, int y, int newColor)
    {
//        int prevColor =

    }

    public static void main(String args[])
    {
        FloodFill f = new FloodFill(8,8);
        int [][]screen = {{1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 0, 0},
        {1, 0, 0, 1, 1, 0, 1, 1},
        {1, 2, 2, 2, 2, 0, 1, 0},
        {1, 1, 1, 2, 2, 0, 1, 0},
        {1, 1, 1, 2, 2, 2, 2, 0},
        {1, 1, 1, 1, 1, 2, 1, 1},
        {1, 1, 1, 1, 1, 2, 2, 1},
    };

    }
}
