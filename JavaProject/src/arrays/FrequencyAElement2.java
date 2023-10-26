package arrays;
import java.util.Scanner;

public class FrequencyAElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int arr[] = {2,4,3,2,4,5,8,6,7,5};
		System.out.println("Enter the number");
		//int key = sc.nextInt();
		

		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-i-1;j++) {
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

		for(int i=0;i<arr.length;i++) {
			int count = 0 ;
			int key = arr[i];
			int j = i;
			while(j<arr.length) {
				if(arr[j]==key) {
					count ++;
					
				}
				j = j+count;
			}
			
			if(count>0) {
				System.out.println("Element | Frequncy");
				System.out.println(key+"\t|\t"+count);
			} else if(count==0) {
				System.out.println(key+" not present");
			}

		}



		sc.close();

	}

}


