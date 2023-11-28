package arrays;

public class First5FactorialInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			int fact = 1;
			for(int k=1;k<=(i+1);k++) {
				fact = fact*k;

			}
			arr[i] = fact;
		}
		for(int j=0;j<arr.length;j++) {

			System.out.println(arr[j]);
		}

	}
}
