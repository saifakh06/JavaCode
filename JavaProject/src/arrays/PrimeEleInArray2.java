package arrays;

public class PrimeEleInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,7,3,4,6,8,11,13};
		
		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			int count  = 0;
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
				 count++;
				}
			}
			if(count==2) {
				System.out.println(arr[i]+" --> prime");
			}
		}

	}

}
