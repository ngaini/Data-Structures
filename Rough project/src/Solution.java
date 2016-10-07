import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String s1[] =  new String[3];
        int x[] = new int[3];
    	Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
            {
                
                s1[i] = sc.next();
                x[i]=sc.nextInt();
                 
                
                
            }
        System.out.print("================================");
        for(int j=0;j<3;j++)
        {
        	System.out.print("\n"+s1[j]);
        	for(int k=0; k<(15-(s1[j].length()));k++)
        	{
        		System.out.print(" ");
        	}
        	
        	if(x[j]<10)
        		System.out.print("00"+x[j]);
        	else if(x[j]<100 && x[j]>=10)
        		System.out.print("0"+x[j]);
        	else
        		System.out.print(x[j]);
//        	System.out.println("\n");
        }
        System.out.println("\n================================");    
            

    }
}