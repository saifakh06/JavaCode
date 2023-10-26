package arrays;

public class ReOcurringEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,2,3,5,7,5,8,9,8,5,4};
		int max = -1;
		int value = 0;
		
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			if(arr[i]!=-1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j] = -1;
					}
				}
				if(count>max) {
					max = count;
					value = arr[i];
				}
			}
		}
		System.out.println(value+" --> "+max);
	}

}
