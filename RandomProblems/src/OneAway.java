/**
 * Created by Nathan on 8/7/2016.
 */
public class OneAway {

    /**
     * Method to check if the two string are one edit away
     */
    boolean checkOneEditAway(String s1, String s2)
    {
        int difference = Math.abs(s1.length()-s2.length());
        if(difference>1)
            return false;

        int i =0;
        int j =0;

        String bigString = s1.length()<s2.length()? s2:s1;
        String smallString = s1.length()<s2.length()? s1:s2;
        boolean differeceFound= false;
        while(i<bigString.length() && j<smallString.length())
        {
            if(bigString.charAt(i)!=smallString.charAt(j))
            {
                if(differeceFound) return false;
                differeceFound = true;

                if(difference==0)
                {
                    j++;
                }
                i++;

            }
            else
            {
                i++;
                j++;
            }

        }
        return true;

    }


    public static void main(String args[])
    {
        OneAway o = new OneAway();
        String s1 = "pale";
        String s2 = "ale";
        if (o.checkOneEditAway(s1, s2))
            System.out.println(s1 + " & " + s2 + " are one edit away");
        else
            System.out.println(s1 + " & " + s2 + " are not one edit away");


    }
}
