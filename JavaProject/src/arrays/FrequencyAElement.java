package arrays;
import java.util.Scanner;

public class FrequencyAElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int arr[] = {2,4,3,2,4,5,8,6,7,5};
		System.out.println("Enter the number");
		int key = sc.nextInt();
		int count = 0 ;


		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count ++;

			}	
		}
		if(count>0) {
			System.out.println("Element | Frequncy");
			System.out.println(key+"\t|\t"+count);
		} else if(count==0) {
			System.out.println(key+" not present");
		}


sc.close();

	}

}


