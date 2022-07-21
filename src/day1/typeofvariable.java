package day1;

public class typeofvariable {
		int a=10;//non static/instance variable global varibale
		static int b=30;//static or class variable
		public void test()
		{
			System.out.println(a);
		}
		public static void demo ()
		{
			System.out.println(b);
		
		}
		public static void main(String[] args) {
			typeofvariable obj=new typeofvariable();
			System.out.println(obj.a);//to call non static global member in static method we need object
			System.out.println(obj.b);
			typeofvariable.demo();
			
		}
	
		}
		
		
		
		
	


