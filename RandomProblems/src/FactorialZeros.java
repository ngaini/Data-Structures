/**
 * Created by Nathan on 7/8/2016.
 */
public class FactorialZeros {

    int factorialZeroSolve(int n)
    {
        int count=0;

        for(int i=5 ; n/i>0; i=i*5)
        {
            int k = (n/i);
            count+= k  ;
        }


        return count;
    }

    public static void main(String args[])
    {
        FactorialZeros f = new FactorialZeros();
        System.out.println(f.factorialZeroSolve(25));

    }
}
