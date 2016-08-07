/**
 * Created by Nathan on 8/2/2016.
 */
public class Palindrome {


    //using string builder class
//    boolean isPalindrome(String str)
//    {
//
//        StringBuilder tempStr = new StringBuilder(str);
//        String rev = tempStr.reverse().toString();
//        System.out.println(rev);
//        if(str.equals(rev))
//            return true;
//        else
//            return false;
//
//
//    }


    //using no extraspace and O(n) time -> prefered method
//    boolean isPalindrome(String str)
//    {
//        int left = 0;
//        int right = str.length()-1;
//        while(left<= right)
//        {
//            if(str.charAt(left) != (str.charAt(right)))
//                return false;
//
//            left++;
//            right--;
//
//        }
//
//
//        return true;
//    }

    //using string reversal technique
    boolean isPalindrome(String str)
    {
        String rev = reverseString(str);
        if(rev.equals(str))
            return true;

        return false;
    }

    final String reverseString(String str)
    {
        StringBuilder temp = new StringBuilder();
        for(int i=str.length()-1;i>=0; i--)
        {
            temp= temp.append(str.charAt(i));
            System.out.println(temp);
        }

        return temp.toString();
    }

    String reverseString(String str, int a)
    {

        return "ola";
    }
    public static void main(String args[])
    {
        Palindrome  p = new Palindrome();
        String str = "abbabba";
        System.out.println(p.reverseString("abba", 9));;
        if(p.isPalindrome(str))
            System.out.println(str+"  is a palindrome");
        else
            System.out.println(str+" is not a palindrome");


    }
}
