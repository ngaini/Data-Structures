import java.util.HashMap;

/**
 * Created by Nathan on 5/20/2016.
 */
public class RandomProbTest {




    boolean anagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return false;
        //create hashmap using one string
        char key;
        int value;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<str1.length();i++)
        {
            key = str1.charAt(i);
            if(hmap.containsKey(key))
            {
                value = hmap.get(key);
                hmap.put(key, value+1);
            }
            else
            {
                hmap.put(key, 0);

            }
        }

        //loop through the second string
        for(int j=0; j<str2.length(); j++)
        {
            key = str2.charAt(j);
            if(hmap.containsKey(key))
            {
                value = hmap.get(key);
                if(value-1>-1)
                    hmap.put(key,value-1);
                else
                    hmap.remove(key);
            }
            else
                return false; // try using break instead of return ??
        }
        if(hmap.isEmpty())
            return true;
        return false;
    }


    public static void  main(String args[])
    {


        String String1="algorithm";
        String String2="logarithm";
        RandomProbTest test1 = new RandomProbTest();
        if(test1.anagram(String1,String2))
            System.out.println("Both the strings are anagrams");
        else
            System.out.println(" Not an anagram");



    }



}
