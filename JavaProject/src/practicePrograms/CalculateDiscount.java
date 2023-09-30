package practicePrograms;
import java.util.Scanner;

public class CalculateDiscount {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		
		System.out.println("Enter the price per unit");
		double price = sc.nextDouble();
		
		if(quantity>100) {
			double total_price = quantity*price;
			double discount = 0.1*total_price;
			System.out.println("No. of quantity :"+quantity+"\nprice per unit :"+price+"\nYour total price :"+total_price
					+"\n You will get a discount of ruppee :"+discount);
			
		} else {
			System.out.println("Your quantity of item is less then 100 so you not get any discount "+"\n Your quantity :"+quantity);
		}
		sc.close();
		
	}

}
