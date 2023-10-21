package arrays;

public class SumOfEleOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {21,45,78,98};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
