package arrays;

public class EvenOddDiagonalArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					if(arr[i][j]%2==0) {
						System.out.println(arr[i][j]+" --> Even");
					} else {
						System.out.println(arr[i][j]+" --> Odd");
					}
				}
			}
		}

	}

}
