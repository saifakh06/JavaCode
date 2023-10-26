package arrays;

public class EvenOddEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,9,7,4,6,8,1,3};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" --> is Even");
			} else {
				System.out.println(arr[i]+" --> is Odd");
			}
		}

	}

}
