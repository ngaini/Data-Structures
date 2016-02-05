import java.time.chrono.MinguoEra;


public class MSApp {
	
	public void sort(int[] a)
	{
		// if only one element is present then it is already sorted
		if(a.length<=1)
			return;
		
		/*
		 *  else split the array into two parts,first half into left and
		 *  second half into right
		 */
		int[] left = new int[a.length/2];
		int[] right= new int[a.length-left.length];
		for(int i=0; i<left.length; i++)
		{	
			left[i]= a[i];
		}
		
		for(int j=0; j<right.length;j++)
		{
			right[j]=a[left.length+j];
		}
		sort(left);
		sort(right);
		//merging the two sorted arrays
		merge(left, right, a);
		
		
	}
	
	public void merge(int[] left, int[] right, int a[] )
	{
		/* i for keeping track of elements of left
		 * j for keeping track of elements of right
		 * k for keeping track of elements of a
		 */
		
		int i =0;
		int j=0;
		int k=0;
		
		while(i<left.length  && j<right.length)
		{
			
			if(left[i]<right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		
		// copy remaining elements of left
		while(i<left.length)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		// copy remaining elements of right
		while(j<right.length)
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}
	
}
