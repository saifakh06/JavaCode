package practicePrograms;

public class CalculateGrossSalary {

	public static void main(String[] args) {
		double basicSalary = 13759.678;
		double grossSalary = 0;
		double hra = 0.0;
		double da = 0.0;
		if(basicSalary>0 && basicSalary<=10000) {
			
			 hra = (20.0/100)*basicSalary;
			 da = (80.0/100)*basicSalary;
			grossSalary = basicSalary+hra+da;
			
			
		} else if (basicSalary>=10001 && basicSalary<=20000) {
			
			 hra = (25.0/100)*basicSalary;
			 da = (90.0/100)*basicSalary;
			grossSalary = basicSalary+hra+da;
			
			
		} else if (basicSalary>20000) {
			
			 hra = (30.0/100)*basicSalary;
			 da = (95.0/100)*basicSalary;
			grossSalary = basicSalary+hra+da;
			
			
		} else {
			System.out.println("Please provide a valid Input");
		}
		System.out.println(" If Basic Salary is "+ basicSalary+"\n Then H.R.A --> "+hra+"\n D.A. --> "+da+"\n Gross Salary will be --> "+grossSalary);
		
	}

}
