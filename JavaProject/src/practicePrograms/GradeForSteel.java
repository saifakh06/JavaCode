package practicePrograms;
import java.util.Scanner;
public class GradeForSteel {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hardness of the steel :");
		double hardness = sc.nextDouble();
		System.out.print("Enter the carbon content of the steel :");
		double carbonContent = sc.nextDouble();
		System.out.print("Enter the tensile Strength of the steel :");
		double tensileStrength = sc.nextDouble();
		String result = null ;
		
		
		if(hardness>50 && carbonContent<0.7 && tensileStrength>5600) {
			 result = "Steel is of Grade --> 10";
			
		} else if(hardness>50 && carbonContent<0.7 && tensileStrength<=5600) {
			result = "Steel is of Grade --> 9 \n tensile Strength should be more!!";
			
		} else if(hardness<=50 && carbonContent<0.7 && tensileStrength>5600) {
			result = "Steel is of Grade --> 8 \n Hardness of the steel should be more!!";
			
		} else if(hardness>50 && carbonContent>0.7 && tensileStrength>5600) {
			result ="Steel is of Grade --> 7 \n Carbon Content of the steel should be less!!";
			
		} else if(hardness>50 || carbonContent<0.7 || tensileStrength>5600) {
			result = "Steel is of Grade --> 6";
			
		} else {
			System.out.println("Your steel is not upto the marks...!!");
		
		}
		System.out.println("Hardness --> "+hardness+"\nCarbon Content in the steel --> "+carbonContent+"\n"
				+ "Tensile Strength --> "+tensileStrength+"\n" + result);
		
		
	}

}
