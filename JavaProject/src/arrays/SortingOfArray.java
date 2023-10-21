package arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4,2,8,7};
		
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		for(int k = 0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}

	}

}
