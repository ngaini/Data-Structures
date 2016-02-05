import java.util.Arrays;


public class mergeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{10,5,65,4,51,45,54};
		System.out.println(Arrays.toString(a));
		MSApp m1 = new MSApp();
		m1.sort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
