package arrays;

public class DiagonalELeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					System.out.println(arr[i][j]+" ");
				}
			}
			//System.out.println();
		}

	}

}
