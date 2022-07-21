package day1;

public class modifier {//for class only public and default are applicable
	public int a=10;
	
int b=50;//default

 protected int c=20;
 
 private int d=20;
	 public static void main(String[] args) {
		 
		 modifier obj =new modifier();
		 System.out.println(obj.a);//public can be access in same class
		 System.out.println(obj.b);//default can be access in  same class
		 System.out.println(obj.c);//protected can be access in same class
		 System.out.println(obj.d);//private can be access in same class
	 }
 }
 
 


