import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Nathan on 7/11/2016.
 */
public class PracticeSet1 {



    ArrayList<String> transform(String start, String end, String[] words)
    {
        ArrayList<String> result = new ArrayList<String>();
        HashSet<String> dict = populateDictionary(words);
        HashSet<String> visited = new HashSet<String>();
        transformUtil(start, end, dict, visited, result);

        return result;
    }

    void  transformUtil(String start, String end, HashSet<String> dict, HashSet<String> visited, ArrayList<String> result)
    {
//        if(index == end.length())
//        {
//            result.add(prefix);
//            return;
//        }


        if(start.equals(end))
        {
//             visited.add(start);
            result.add(start);
            return;


        }

        visited.add(start);
        ArrayList<String> words = oneWordAway(start);
        for(String word : words)
        {
            if(dict.contains(word) && !visited.contains(word))
                transformUtil(word, end, dict, visited,result);

        }


        return;
    }

    HashSet<String> populateDictionary(String[] words)
    {
        HashSet<String> dictionary = new HashSet<String>();
        for(int i=0 ; i<words.length; i++)
            dictionary.add(words[i]);
        return dictionary;
    }


    ArrayList<String> oneWordAway(String start)
    {
        ArrayList<String> probableWords = new ArrayList<String>();

        for(int i =0; i<start.length(); i++)
            for (char c = 'a'; c<='z'; c++)
            {
                String temp = start.substring(0, i)+ c+ start.substring(i+1);
                probableWords.add(temp);
            }
        return probableWords;
    }


    public static void main(String args[])
    {
        PracticeSet1 p = new PracticeSet1();
        String[] words = {"maps", "tan", "tree", "apple", "cans", "help", "aped", "pree", "pret", "apes", "flat", "trap", "fret", "trip", "trie", "frat", "fril"};
        ArrayList<String> temp = p.transform("tree", "flat", words);
        if(temp != null)
        {
            for(String word: temp)
            {
                System.out.print(" "+ word);
            }
        }
        else
            System.out.println(" word transform not possible");




    }
}
