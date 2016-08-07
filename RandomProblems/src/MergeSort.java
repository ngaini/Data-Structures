/**
 * Created by Nathan on 7/21/2016.
 */
public class MergeSort {


    void merge(int left, int mid, int right,int[] array)
    {
        int[] leftArray;
        int[] rightArray;

        int leftArraySize = mid - left+1;
        int rightArraySize = right - mid ;

        leftArray = new int[leftArraySize];
        rightArray = new int[rightArraySize];

        for(int i =left ; i<=mid; i++)
        {
            leftArray[i-left]= array[i];
        }
        for(int i = mid+1;i<=right; i++)
        {
            rightArray[i-(mid+1)]= array[i];

        }
        int i=0, j=0, k =left;

        while( i<leftArraySize && j < rightArraySize)
        {
            if(leftArray[i]<rightArray[j])
            {
                array[k] = leftArray[i];
                i++;
                k++;
            }
            else
            {
                array[k] = rightArray[j];
                j++;
                k++;
            }

        }

        while(i<leftArraySize)
        {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<rightArraySize)
        {
            array[k] = rightArray[j];
            j++;
            k++;
        }



    }

    void sort(int left, int right, int[] array)
    {
        if(left< right)
        {
            int mid = (left + right)/2;

            sort(left, mid, array);
            sort(mid+1, right, array);

            merge(left, mid, right, array);


        }


    }


    public static void main(String args[])
    {
        int[] array ={7 , 2 , 5 , 22 ,1 ,19 , 3};
        MergeSort m1 = new MergeSort();



//        m1.sort(0, array.length-1, array);
//
//        for (int value: array)
//        {
//            System.out.print(value+" ");
//        }


    }
}
