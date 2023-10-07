package loops.while_pkg;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 7;
		int firstNum = 0;
		int secondNum = 1;
		int sp = 3;
		int thirdNum;
		
		System.out.print(firstNum+" "+secondNum);
		
		while(sp<=num) {
			thirdNum = firstNum + secondNum;
			System.out.print(" "+thirdNum);
			 firstNum= secondNum;
			secondNum = thirdNum;
			
			sp++;
			
		} 

	}

}
