package loops.while_pkg;

public class HCF{
	public static void main(String[] args) {
		int num1 = 45;
		int num2 = 78;
		 int sp = 1;
		 int largestGCD = 1;
		 
		 while (sp<=num2) {
			 if(num1%sp==0 && num2%sp==0) {
				 if(sp>largestGCD) {
					 largestGCD = sp;
				 }
			 }sp++;	
		 }
		 System.out.println(largestGCD);
	}
}





//    public static void main(String[] args)
//    {
//        Scanner console = new Scanner(System.in);
//     
//        int dividend, divisor;
//        int remainder, hcf = 0;
//        
//        System.out.print("Enter the first number ");
//        dividend = console.nextInt();
//        
//        System.out.print("Enter the second number ");
//        divisor = console.nextInt();        
//        
//        do
//	{
//            remainder = dividend % divisor;
//            
//            if(remainder == 0)
//            {
//                hcf = divisor;
//            }
//	    else
//            {
//                dividend = divisor;
//                divisor = remainder;
//	    }
//            
//        }while(remainder != 0);
//
//        System.out.println("HCF: " + hcf);
//    }  
//}
