package constructor;

public class cons {
	cons()//user defined constructor
	{
		System.out.println("hello im maddy");
		
	}
	public void test() {
		System.out.println("hello im tester");
	}
	public static void main(String[] args) {
		cons obj =new cons();//cons can be only called during object creation
		obj.test();
		obj.test();
		obj.test();
		cons obj1 = new cons();
		obj.test();
		
	}
		
		
		
			
		}
	


