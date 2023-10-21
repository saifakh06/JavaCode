package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		int arr[] = {1,2,3,4};
		//		for(int i=arr.length-1;i >=0;i--) {
		//			System.out.println(arr[i]);
		//		} 

//		int arr[] = {1,2,3,4};
//		int start = 0;
//		//int n = arr.length;
//		int end = arr.length-1;
//
//		while(start<end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start ++;
//			end --;
//		}
//
//
//		for(int i = 0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		int a [] = {1,2,3,4};
		int b [] = new int[a.length];
		int j = 0;
		
		for(int i=a.length-1;i>=0;i--) {
			b[j]= a[i];
			j++;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			System.out.print("\n"+b[i]+" ");
		}




	}

}
