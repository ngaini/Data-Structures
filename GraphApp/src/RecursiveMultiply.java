/**
 * Created by Nathan on 7/5/2016.
 */
public class RecursiveMultiply {


    /**
     * naieve method using brute force
     * own implementation
     * @param x
     * @param y
     * @return
     */
    int mul(int x, int y)
    {
        if(x==0 || y ==0) return 0;

        int max = Math.max(x,y);
        int min = Math.min(x,y);

        return mulUtil(max, min);

    }

    int mulUtil(int x, int y )
    {
        if(y>0)
        {
            if(y == 1) return x;

            return x + mulUtil(x, y-1);
        }
        else
        {
            if(y == -1) return -x;

            return -x + mulUtil(x, y+1);
        }


    }
    public static void main(String args[])
    {
        RecursiveMultiply r1 = new RecursiveMultiply();
        System.out.println(r1.mul(-100, 5));

    }
}
