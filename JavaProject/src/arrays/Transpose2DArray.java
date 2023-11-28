package arrays;
import java.util.Scanner;

public class Transpose2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 2;
		int cols = 3;
		Scanner sc = new Scanner(System.in);
		
		int arr [][] = new int [rows][cols]; 
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int j=0;j<cols;j++) {
			for(int i=0;i<rows;i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
