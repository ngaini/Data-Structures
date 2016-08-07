/**
 * Created by Nathan on 7/4/2016.
 * CCI 4.3 Magic index Problem
 */
public class MagicIndex {



//    /**
//     * Brute force technique
//     * @param n
//     * @return
//     */
//    int findMagicIndex(int n, int A[])
//    {
//        if(n<A.length)
//        {
//            if(n == A[n])
//                return n;
//            return findMagicIndex(n+1, A);
//        }
//        else
//            return -1;
//
//    }


    /**
     * O(log N) time -  using binary search
     * Solution works only when all values are distinct and in sorted order
     * @param start
     * @param end
     * @param A
     * @return
     */
//    int findMagicIndex(int start, int end, int[] A)
//    {
//        if(start>end) return -1;
//        int mid = (start+end)/2;
//        if(mid == A[mid]) return mid;
//        if(A[mid]> mid)
//            return findMagicIndex(start, mid-1, A);
//        else
//            return findMagicIndex(mid+1, end, A);
//
//
//
//    }

    /**
     * Works even when values are not distinct.
     * Values continue to be sorted
     * @param start
     * @param end
     * @param A
     * @return
     */
    int findMagicIndex(int start, int end , int[] A)
    {

        if(start<=end)
        {
            int midIndex = (start+end)/2;
            int midIndexValue = A[midIndex];

            if(midIndex == midIndexValue) return midIndex;

            int leftIndex = midIndex-1<midIndexValue? midIndex-1 : midIndexValue;
            int left = findMagicIndex(start, leftIndex, A);
            if(left>-1) return left;

            int rightIndex = midIndex+1>midIndexValue? midIndex+1 : midIndexValue;
            int right = findMagicIndex(rightIndex, end, A);
            return right;

        }
        else
            return -1;




    }

    public static void main(String args[])
    {
        MagicIndex m = new MagicIndex();
//        int[] A={-20,-5,0,2,4,7};
        int[] A = {-10,-5,2,2,2,3,4,7,9,12,13};
//        int index = m.findMagicIndex(0 , A);
        int index = m.findMagicIndex(0, A.length-1 , A);
        if(index!= -1)
            System.out.println("Index "+A[index]+ "  = A["+index+"]"  );
        else
            System.out.println("No Magic index found");


    }



}
