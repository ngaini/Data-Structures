import java.util.HashMap;

/**
 * Created by Nathan on 8/6/2016.
 */
public class PalindromePermutation {


    boolean checkPalindromePermutation(String str)
    {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for(int i =0;i<str.length();i++)
        {
            Character c = str.charAt(i);
            if(c != ' ')
            {
                if(hmap.get(c) != null)
                    hmap.put(c,hmap.get(c)+1);
                else
                    hmap.put(c, 1);

            }

        }
        int count =0;
        for(Character c: hmap.keySet())
        {
            if(hmap.get(c)==1)
                count++;

        }

        if(count ==1)return true;

        return false;



    }

    public static void main(String args[])
    {
        PalindromePermutation p = new PalindromePermutation();
        String str = "Taco cat";
        if(p.checkPalindromePermutation(str))
            System.out.println(" The string '"+str+"' is a permutation of a palindrome");
        else
            System.out.println(" The string '"+str+"' is a permutation of a palindrome");


    }
}
