package adavnace;

import java.util.Scanner;

public class Userform {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter your name");
	
	String name=scan.nextLine();
	
	System.out.println("you have entered "+name);
	
	System.out.println("enter your age");
	
	int age= scan.nextInt();
	
	System.out.println("you have enterd age"+age);
	
}
}
