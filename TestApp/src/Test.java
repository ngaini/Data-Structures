/**
 * Created by Nathan on 4/8/2016.
 */
public class Test {

    public static void main(String args[])
    {
        int[] a = {2,3,5,7,15,12,23,45};
        for (int i=0; i<=a.length-1; i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println("\n");
        System.out.println("value of a is >>"+a);
        int[] b = new int[a.length];
        System.out.println("value of b is >>"+b);
        b=a;
        System.out.println("value of b is >>"+b);
        for (int i=0; i<=a.length-1; i++)
        {
            System.out.print(" "+b[i]);
        }

    }
}
