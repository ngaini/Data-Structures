import javax.xml.transform.sax.SAXSource;
import java.util.HashMap;

/**
 * Created by Nathan on 8/4/2016.
 */
public class CheckPermutation {


    boolean isPermutation(String source, String target)
    {
        if(target.length() != source.length()) return false;
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        //
        for(int i =0 ; i<target.length(); i++)
        {
            Character c = target.charAt(i);
            if(hmap.get(c)!=null)
            {
                int count = hmap.get(c);
                hmap.put(c, count+1);
            }
            else
                hmap.put(c, 1);

        }

        for(int i=0; i<source.length();i++)
        {
            Character c= source.charAt(i);
            if(hmap.get(c)!= null)
            {
                int count = hmap.get(c);
                if(count-1 != 0)
                    hmap.put(c, count -1);
                else
                    hmap.remove(c);
            }
            else
                return false;


        }

        if(!hmap.isEmpty()) return false;

        return true;



    }


    public static void main(String args[])
    {
        CheckPermutation cp = new CheckPermutation();
        if(cp.isPermutation("apple", "ppliea"))
            System.out.println(" is a permutation");
        else
            System.out.println(" is a NOT permutation");




    }
}
