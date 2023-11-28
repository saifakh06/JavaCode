package arrays;

public class FactInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,2,6};
		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			int fact = 1;
			for(int j=1;j<=n;j++) {
				fact = fact*j;
			}
			System.out.println(arr[i]+" --> "+fact);
		}

	}

}
