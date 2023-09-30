package practicePrograms;
import java.util.Scanner;

public class SteelGradeUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hardness of the steel :");
		double hardness = sc.nextDouble();
		System.out.print("Enter the carbon content of the steel :");
		double carbonContent = sc.nextDouble();
		System.out.print("Enter the tensile Strength of the steel :");
		double tensileStrength = sc.nextDouble();
		String result = null;
		
		
		int op = (hardness>50 && carbonContent<0.7 && tensileStrength>5600)? 1:(hardness>50 && carbonContent<0.7 && tensileStrength<=5600)? 2: 
			(hardness<=50 && carbonContent<0.7 && tensileStrength>5600)? 3:(hardness>50 && carbonContent>0.7 && tensileStrength>5600)? 4: 
				(hardness>50 || carbonContent<0.7 || tensileStrength>5600)? 5:0;
		
		if(hardness<0 || carbonContent<0 || tensileStrength<0) {
			System.out.println("Please enter correct data");
		} else {
		
		switch(op) {
		case 1: result = "Steel is of grade --> 10";
		break;
		case 2: result = "Steel is of grade --> 9 \nTensile Strength should be more!!";
		break;
		case 3: result = "Steel is of grade --> 8 \nHardness of steel should be more!!";
		break;
		case 4: result = "Steel is of grade --> 7 \nCarbon content should be less then 0.7";
		break;
		case 5: result = "Steel is of grade --> 6 \n Please check your steel compositions!!";
		break;
		case 0: result = "Steel is of grade --> 5 \nSteel is not fit for the use!!";
		break;
		default : System.out.println("Please enter correct data");
		}
		System.out.println("Hardness --> "+hardness+"\nCarbonContent --> "+carbonContent+"\nTensile Strength --> "+tensileStrength
				+"\n"+result);
		}

		
	} //p.s.v.m

}// class
