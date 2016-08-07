import java.util.Arrays;

/**
 * Created by Nathan on 8/6/2016.
 */
public class URLify {

    void convertIntoURL(char[] str, int length)
    {
        int count = 0;
        for(char c: str  )
        {
            if(c == ' ')
                count++;
        }
        int newArrayLength = length+ (count*2);
        char[] result = new char[newArrayLength];
        for(int i= length-1;i>=0;i--)
        {
            if(str[i]==' ')
            {
                result[newArrayLength-1]='0';
                result[newArrayLength-2]='2';
                result[newArrayLength-3]='%';
                newArrayLength = newArrayLength-3;
            }
            else
            {
                result[newArrayLength-1]= str[i];
                newArrayLength = newArrayLength-1;
            }

        }
        System.out.println(Arrays.toString(str));
        System.out.println("Result is "+ Arrays.toString(result));
    }


    public static void main(String args[])
    {
        URLify url = new URLify();
        char[] str = "Welcome Mr. Smith".toCharArray();

        url.convertIntoURL(str, str.length);

    }
}
