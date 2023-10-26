package arrays;

public class AverageOfArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {3,5,3,7,9,8};
		int sum = 0;
		double size = a.length;
		double avg = 0;
		
		for(int i=0;i<size;i++) {
			sum = sum + a[i];
			avg  = sum/size;
		}
		System.out.println(avg+" --> Average");

	}

}
