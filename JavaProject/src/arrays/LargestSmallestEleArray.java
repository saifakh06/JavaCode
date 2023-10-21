package arrays;

public class LargestSmallestEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {21,45,78,76,98,68,90,99};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			} else if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
