package nonprimative;

public class childclass1 {
	int c=30;
	
	public void demo()
	{
		System.out.println("i am child property");
		
	}

	public void test1()// overriding property of parent
	{
		System.out.println("hello everyone");
		
	}
	
	public static void main(String[] args) {
		childclass1 obj = new childclass1();
		
		parentclass1 obj2 =new parentclass1();
		
		obj.test1();
		obj2.test1();
		
		obj.demo();
		
		
	}
}
