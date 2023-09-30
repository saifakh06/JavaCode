package practicePrograms;

public class ReverseOfNumber {
	public static void main(String[] args) {
		
		int num =1233 ;
		int store = 0;
		for(int i =1;i<=num;i++) {
			store = num%10;
			num = num/10;
			System.out.print(store);
		}
		
	}
}
