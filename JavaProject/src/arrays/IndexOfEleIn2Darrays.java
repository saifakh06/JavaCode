package arrays;
import java.util.Scanner;

public class IndexOfEleIn2Darrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions");
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int [][] matrix = new int[rows][cols];
		//input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.print("Get the index of: ");
		int key = sc.nextInt();
		//output
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(matrix[i][j]==key) {
					System.out.println("At row "+i+" and"+" column "+j);
				}
			}
		}
		sc.close();

	}

}
