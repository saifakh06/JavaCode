package arrays;

public class FindSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=3;j<arr.length-3;j++) {
				arr[j]=arr[i];
				
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
