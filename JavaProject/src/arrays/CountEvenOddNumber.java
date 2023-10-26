package arrays;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,7,9,6,8,11,3};
		int count = 0;
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				count++;
				
			}else {
				cnt++;
			}
			
		}System.out.println(count+" --> Evens");
		System.out.println(cnt+" --> Odds");

	}

}
