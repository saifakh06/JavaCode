package arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {21,23,68,70,80};
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				//System.out.println();
			}
			
		}
		System.out.println(max);
	}

}
