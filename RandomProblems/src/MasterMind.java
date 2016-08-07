import java.util.HashMap;

/**
 * Created by Nathan on 7/7/2016.
 * CCI 16.15 : Master Mind problem
 * similar logic to book but using HashMap instead of arrays
 */
public class MasterMind {

    class Result
    {
        int hit;
        int pseudoHit;

        Result()
        {
            hit = 0;
            pseudoHit =0;
        }
    }
    Result solve(String solution, String guess)
    {
        if(solution.length()!= guess.length()) return null;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Result result = new Result();
        for(int i= 0;i<solution.length(); i++)
        {
            if(solution.charAt(i) == guess.charAt(i))
                result.hit++;
            else
            {
                if(!map.containsKey(solution.charAt(i)))
                    map.put(solution.charAt(i), 1);
                else
                {
                    int count = map.get(solution.charAt(i));
                    map.put(solution.charAt(i), count+1);
                }
            }

        }

        for(int i =0 ; i<solution.length(); i++)
        {
            if(solution.charAt(i)!=guess.charAt(i)  && map.get(guess.charAt(i))!= null && map.get(guess.charAt(i)) > 0 )
            {
                int guessCount = map.get(guess.charAt(i));
                map.put(guess.charAt(i), guessCount-1);
                result.pseudoHit++;
            }

        }
        return result;
    }

    public static void main(String args[])
    {
        MasterMind m = new MasterMind();
        Result res =m.solve("YGBY","GGRR");

        System.out.println(" pseudo hits : "+res.pseudoHit+ " Hits: "+res.hit);

    }


}
