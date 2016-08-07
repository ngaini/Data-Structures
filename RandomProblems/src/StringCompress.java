/**
 * Created by Nathan on 8/7/2016.
 */
public class StringCompress {


    /**
     * Efficient technique : first check if the compressed string is smaller than or equal to the original string
     * if YES then return the compressed string
     * if NO then return the original string
     * This is technique saves the space : check CCI for explanation
     * @param str
     * @return
     */
     String compress(String str)
    {
        int compressedStringLenght=calculateCompressedLength(str);
//        System.out.println(compressedStringLenght);
//        return result;
        if(compressedStringLenght > str. length()) return str;

        StringBuilder result = new StringBuilder(compressedStringLenght);
        int characterCount=0;
        for(int i=0; i<str.length();i++)
        {
            characterCount++;
            if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1))
            {
                result.append(str.charAt(i));
                result.append(characterCount);
                characterCount=0;
            }
        }


        return result.toString();

    }

     int calculateCompressedLength(String str)
    {
        int characterCount =0;
        int compressedLenght=0;

        for(int i=0; i<str.length();i++)
        {
            characterCount++;
            if (i+1>=str.length() || str.charAt(i)!=str.charAt(i+1))
            {
                compressedLenght+= 1+String.valueOf(characterCount).length();
                characterCount=0;
            }
        }

        return compressedLenght;
    }


    public static void main(String args[])
    {
        StringCompress s = new StringCompress();
        System.out.println(s.compress("aaaaaaaaab"));

    }

}
