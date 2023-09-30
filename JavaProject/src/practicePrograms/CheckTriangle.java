package practicePrograms;

public class CheckTriangle {
	public static void main(String [] args) {
		
		double ang1 = 45;
		double ang2 = 90;
		double ang3 = 45;
		double sum = ang1 + ang2 + ang3;
		
		
			
		 if(sum==180 && ang1<90 && ang2<90 && ang3<90) {
			System.out.println("Acute Triangle");
			
		} else if(sum==180 && ang1==90 || ang2==90 || ang3==90) {
			System.out.println("Right Angled Triangle");
			
		} else if(sum==180 && ang1>90 || ang2>90 || ang3 >90) {
			System.out.println("Obtuse Angled Triangle");
			
		} else {
			System.out.println("Not a triangle");
		}
			

	}

}
