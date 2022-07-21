package day2;
import day1.modifier;
public class access {
	public static void main(String[] args) {
		modifier obj= new modifier();
		System.out.println(obj.a);//public can be access outside the package
		//System.out.println(obj.b);//default cannot be access outside the package
		//System.out.println(obj.c);// protected cannot be access outside the package
	//	System.out.println(obj.d);//private cannot be access outside the class
		
	}
	
	

}
