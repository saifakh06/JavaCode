package arrays;

public class OnceElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,4,3,5,4,6,7,9,0};
		
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			if(arr[i] != -1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j] = -1;
					}
				}
				if(count == 1) {
					System.out.println(arr[i]+" --> "+count);
				}
			}
		}

	}

}
