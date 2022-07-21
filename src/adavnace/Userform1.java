package adavnace;
import java.util.Scanner;


public class Userform1 {
	public static void main(String[] args) {;
	
		Scanner scan= new Scanner (System.in);
		
		System.out.println("enter your pin");
		
		int pin= scan.nextInt();
		
		if (pin == 1234)
		{
			System.out.println("please enter the amount");
			int amount =scan.nextInt();
			System.out.println("Please collect yor cashof"+amount);
		}
		else
		{
			System.out.println("you have enterd a correct pin");
		}
		
	}

}
