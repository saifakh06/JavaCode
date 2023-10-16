package loops.for_pkg;

public class HarshadNumber {

	public static void main(String[] args) {
		int num = 28;
		harshad_no(num);
		
	}
	public static void harshad_no(int num) {
	
	int num1 = num;
	int sum = 0;
	
	while(num>0) {
		int ld = num%10;
		sum = sum+ld;
		num = num/10;
	}
	 if(num1%sum==0) {
		 System.out.println(num1+" is a harshad number");
	 } else {
		 System.out.println(num1+" is not a harshad number");
	 	}
	 }
}


