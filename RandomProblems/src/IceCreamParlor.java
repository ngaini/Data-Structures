import java.util.*;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

/**
 * Created by Nathan on 5/22/2016.
 */
public class IceCreamParlor {

    class Result{
        int lowerIndex ;
        int higherIndex;

        Result()
        {
            this.lowerIndex=-1;
            this.higherIndex=-1;
        }
    }

    Result increamParlor(int[] cost, int sum)
    {
        int i=0;
        int j = cost.length-1;
        Result res = new Result();
        int [] temp = new int[j+1];
        for(int p =0; p<cost.length;p++)
            temp[p]=cost[p];
        Arrays.sort(temp);
        while(i<j)
        {
            if(temp[i]+temp[j]> sum)
                j--;
            if(temp[i]+temp[j]<sum)
                i++;
            if(temp[i]+temp[j]==sum)
                break;



        }

        for(int k=0;k<cost.length;k++)
        {

            if((cost[k]==temp[i] || cost[k]==temp[j])&& res.lowerIndex==-1)
                res.lowerIndex = k+1;

            if(k>res.lowerIndex && (temp[i]==cost[k] || temp[j]==cost[k]))
                res.higherIndex = k+1;


        }

        return res;



    }


    // prob 7 Karumanchi : Recursion
    int i=0;

    void possibilites(String input, String output, int i)
    {

            if(i==input.length())
            {
                System.out.println("The possible output is "+output);
                return;
            }

            if(input.charAt(i)=='?') {
//                output += "0";
//                i++;
                possibilites(input, output+="0", i+1);

//                output += "1";
//                i++;
                possibilites(input, output += "1", i+1);


            }
            else
            {
                output += input.charAt(i);

                possibilites(input,output, i+1);
            }







    }


    /**
     * Problem on geek for geeks: valid only for array of vsize n and entries between 0..n-1 , also there can be multiple entries of the same array entry
     * @param arr
     */
    void findduplicates(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[abs(arr[i])]>=0)
                arr[abs(arr[i])]= - arr[abs(arr[i])];
            else
                System.out.print(" "+abs(arr[i]));


        }
    }


    /**
     * will work in even when array values exceed the array size but space complexity : O(n)
     * @param arr
     */
    void findDuplicate(int[] arr)
    {
        HashSet<Integer> hSet = new HashSet<>();
        //construct hashset
        for(int i= 0; i< arr.length; i++)
        {
            if(!hSet.contains(arr[i]))
                hSet.add(arr[i]);
            else
                System.out.print(" "+arr[i]);
        }
    }

    /**
     * To find detect if there exists pythagorean triplet in an array
     * @param arr
     * @return
     */
    boolean pythagoreanTriplet(int[] arr)
    {
        Arrays.sort(arr);
        //squaring tha values of sorted array
        for(int i =0; i<arr.length;i++)
         arr[i]*=arr[i];
        for(int k =arr.length-1;k>=0;k--)
        {
            int i =0;
            int j=k-1;
            while(i<j)
            {
                if(arr[i]+arr[j]==arr[k])
                {
                    System.out.println(" Pythagorea triplet is "+ arr[i]+" "+arr[j]+" "+arr[k]);
                    return true;
                }
                if(arr[i]+arr[j]>arr[k])
                    j--;
                if(arr[i]+arr[j]<arr[k])
                    i++;
            }
        }
        return false;
    }


    boolean detectAnagram(String str1, String str2)
    {
        HashMap<Character, Integer> hmap = new HashMap<>();

        if(str1.length()!=str2.length()) return false;
        for(int i=0; i<str1.length();i++)
        {
            if(!hmap.containsKey(str1.charAt(i)))
                hmap.put(str1.charAt(i), 1);
            else
            {
                int val = hmap.get(str1.charAt(i));
                hmap.put(str1.charAt(i), val+1);
            }
        }


        for(int j=0; j<str2.length();j++)
        {
            char data =str2.charAt(j);
            if(hmap.containsKey(data))
            {
                int val = hmap.get(data);
                if(val-1==0)
                    hmap.remove(data);
                else
                    hmap.put(data,val-1);

            }
            else return false;
        }
        if(hmap.size()==0)
            return true ;
        else return false;
    }



    void dateDifference(String date1, String date2)
    {
//        String date1Temp="" ;
//        String date2Temp="" ;
//        for(int i =0; i<date1.length();i++)
//        {
//            int count =0;
//            if(date1.charAt(i) != '/'){
//                date1Temp += date1.charAt(i);
//
//            }
//            else ++count;
//
//
//        }
//        int date1Int = Integer.parseInt(date1Temp);
//
//        for(int i =0; i<date2.length();i++)
//        {
//            int count=0;
//            if(date2.charAt(i) != '/'){
//                date1Temp += date2.charAt(i);
//            }
//            else ++count;
//
//        }
//        int date2Int = Integer.parseInt(date2Temp);
//
//        if(date1Int>date2Int)
//        {
//
//        }

        String[] date1Arr = date1.split(Pattern.quote("/"));
        String[] date2Arr = date2.split(Pattern.quote("/"));
//        for(int i=0;i<date1Arr.length;i++)

//        if(compareDates(date1Arr,date1Arr))
//        {
//            if(Integer)
//        }






    }

    //compares if date one is bigger than date2
    boolean compareDates(String[] date1 , String[] date2)
    {
        //comparing the years
       if((Integer.parseInt(date1[2]) > Integer.parseInt(date1[2])))
           return true;
        else if(Integer.parseInt(date1[0])>Integer.parseInt(date2[0])) //month
           return true;
        else if(Integer.parseInt(date1[1])>Integer.parseInt(date2[1])) //dates
           return true;

        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        IceCreamParlor sol = new IceCreamParlor();
//        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();
//        for(int l=0;l<t;l++)
//        {
//            int sum = input.nextInt();
//            int arraySize = input.nextInt();
//            int[] costArray = new int[arraySize];
//            for(int m = 0; m<arraySize; m++)
//            {
//                costArray[m] = input.nextInt();
//
//            }
//
//            Result result =sol.increamParlor(costArray,sum);
//            System.out.println(result.lowerIndex+" "+result.higherIndex);
//        }

//        String testCase = "01?0?101";
//        String output= "";
//        sol.possibilites(testCase, output, 0);

//        int[] arr = {1, 2, 3, 12, 3, 6, 6, 7 , 15, 12,15};
//        sol.findDuplicate(arr);


//        //pythagorean triplet test
//        int[] arr = {6,7,8,10,1,2,3,4,5};
//        if(sol.pythagoreanTriplet(arr))
//            System.out.println(" Triplet Exists");
//        else
//            System.out.println(" No triplet Exists");

        //anagram test
//        String st1= "algorithm";
//        String st2 = "logrithma";
//        if(sol.detectAnagram(st1,st2))
//            System.out.println("The two strings are anagrams");
//        else
//            System.out.println("The two strings NOT are anagrams");

        String date = "06/19/2016"; //mmDDyyyy
        String[] pattern = date.split(Pattern.quote("/"));

    }
}
