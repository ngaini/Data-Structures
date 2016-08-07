import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Nathan on 8/3/2016.
 */
public class NonRepeatingCharacter {

    //non repeating character in String
    Character nonRepeating(String str)
    {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for(int i=0; i<str.length(); i++)
        {
            Character c = str.charAt(i);
            if(hmap.get(c) !=null)
            {
                Integer count = hmap.get(c);
                hmap.put(c,count+1);
            }
            else
                hmap.put(c, 1);
        }

        for(int i=0; i<str.length(); i++)
        {
            Character c = str.charAt(i);
            if(hmap.get(c) == 1)
                return c;
        }

        return Character.MIN_VALUE;
    }

    public static void main(String args[])
    {

        NonRepeatingCharacter n = new NonRepeatingCharacter();
        Character result = n.nonRepeating("adzbdcab");
        if(result!= Character.MIN_VALUE)
            System.out.println("The first non repeating character is "+result);
        else
            System.out.println("There result found for rirst non repeating character");
    }
}
