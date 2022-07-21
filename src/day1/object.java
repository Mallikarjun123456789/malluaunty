package day1;

public class object {
	int a=20;//non static
	static  int b=30;// static variable
	
	
	public void pooja()
	{
		System.out.println("hi this is pooja");
		
	}
		public static void poonam()// static method	
		{
			System.out.println("hi this is poonam");
			
		}
		public static void main(String[] args) {
			object.poonam();
			System.out.println(object.b);
			object obj =new object();
			obj.pooja();
			System.out.println(obj.a);
		}
}
