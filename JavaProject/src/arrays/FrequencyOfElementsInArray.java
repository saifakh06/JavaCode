package arrays;

public class FrequencyOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,7,8,2,1,4,2,6,8,9};

		for(int i=0;i<arr.length;i++) {
			int count = 1;
			if(arr[i]!=-1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j] = -1;
					}
				}
				System.out.println(arr[i]+" --> "+count);
			}
		}

	}

}
