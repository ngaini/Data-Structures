
public class MergeSortMain {

//	int[] A;
	int mid;
	public void MergeSort(int A[], int left, int right)
	{
		System.out.println("in MS");
		display(A);
		int count =1;
		
		System.out.println(" here  left"+left+" right"+right);
		if(right>left && count<3)
		{
			 mid =((right+left)/2);
//			System.out.println(" here mid"+mid);
			System.out.println("OLAAAA here  mid:"+mid+" left:"+left+" right:"+right);
//			System.out.println("this is mid we"+mid);
			count++;
			MergeSort(A, left, mid);
//			System.out.println("this is mid "+mid);
			System.out.println("=====> now in mid+1 side   <======");
			MergeSort(A, (mid+1), right);
			System.out.println(" &&&&&&& in Merge ");
			Merge(A, left, mid, right);
			
		}
	}
	
	
	public void display(int A[])
	{
		System.out.print("Array elements are:\t");
		for(int i=0; i<A.length;i++)
			System.out.print(" "+A[i]);
		System.out.println("\n");
	}
	public void Merge(int A[], int left, int mid, int right)
	{
		System.out.println("\nleft"+left+" :\tmid:"+mid+" \tright:"+right+"\n");
		
//		display(A);
		// variables to traverse left and right temporary arrays and one for the main one
		int i,j, k;
		
		// variables to for the size of left and right
		int n1,n2;
		n1 =(left -mid)+1;
		n2 = (right-mid);
		System.out.println("n1 :" +n1+ " n2:"+n2+" l:"+left+" r:"+right);
		//temporary arrays left and right
		int[] L = new int[n1];
		int[] R = new int [n2];
		//for transferring the values of A[] to temporary arrays left and right
		for(int a=0; a<n1; a++)
		{
			System.out.println("A[left+a] :" +A[left+a]+ " a:"+a+" l:"+left);
			L[a] = A[left+a];
			
		}
		for(int b=0; b<n2; b++)
		{
			System.out.println("A[mid+1+b] :" +A[mid+1+b]+ " b:"+b+" r:"+right);
			R[b] = A[mid+1+b];
			
		}
		System.out.println("#### in L ####");
		display(L);
		System.out.println("#### in R ####");
		display(R);
		i=j=0;
		k=left;
		//merge the sort and merge the two temporary arrays
		while(i<n1 && j<n2)
		{
			if(L[i]<R[j])
			{
				A[k]=L[i];
				i++;
			}
			else
			{
				A[k]=R[j];
				j++;
			}
			k++;
		}
		// if any elements are remaining in left array
		while(i<n1)
		{
			A[k]= L[i];
			i++;
			k++;
		}
		
		// if any elements are remaining in right array
		while(j<n2)
		{
			A[k] = R[j];
			j++;
			k++;
		}
//		display(A);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//give an array A[]
		int left = 0;
		int right =6;
		 int[] A = new int[] {10,7,2,12,1,6,2};
		 
		 MergeSortMain a = new MergeSortMain();
		 a.display(A);
		 a.MergeSort(A, left, right);
		 a.display(A);
	}

}
