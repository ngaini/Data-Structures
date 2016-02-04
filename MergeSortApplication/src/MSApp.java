import java.time.chrono.MinguoEra;


public class MSApp {
	
	// merge method
	
	public void MergeSort(int[] A, int[] temp, int left, int right )
	{
		int mid;
		if(right>left)
		{
			mid=(right+left)/2;
			MergeSort(A, temp, left, mid);
			MergeSort(A, temp, mid+1, right);
			// now to merge the two arrays
			Merge(A, temp, left, mid, right);
//			display(A);
		}
	}
	
	public void Merge(int[] A, int[] temp, int left,int mid, int right )
	{
		int i, left_end, size, temp_pos;
		left_end = mid -1;
		temp_pos = left;
		size = right - left+1;
		while((left<=left_end)&&(mid<=right))
		{
			if(A[left]<= A[mid])
			{
				temp[temp_pos]= A[left];
				temp_pos+=1;
				left+=1;
			}
			else
			{
				temp[temp_pos]=A[mid];
				temp_pos+=1;
				mid+=1;
				
			}
		}
		while(left<=left_end)
		{
			temp[temp_pos]= A[left];
			temp_pos+=1;
			left+=1;
		}
		while(mid<=right)
		{
			temp[temp_pos]=A[mid];
			temp_pos+=1;
			mid+=1;
		}
		for(i=0; i<=size; i++)
		{
			A[right]= temp[right];
			right-=1;
		}
	}
	
	public void display(int[] A)
	{
		System.out.println("Array elements are");
		for(int i=0; i<7; i++)
			System.out.print(" "+A[i]);
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MSApp m1= new MSApp();
		int[] A= new int[] {10,15,9,1,8,50,2};
		int left=0;
		int right=6;
		int[] temp = new int[7];
		m1.display(A);
		m1.MergeSort(A, temp, left, right);
//		m1.display(A);
	}

}
