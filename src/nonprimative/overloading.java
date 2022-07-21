package nonprimative;

public class overloading {
	
	public void test()
	{
		System.out.println("hello i am argument");
	}
	public void test(int a)
	{
		System.out.println(a);
	}
	public void test(int a, int b)
	{
		System.out.println(a-b);
		
	}
	public void test1(int a, int c)
	{
		System.out.println(a+c);
	}
	
	public static void main(String[] args) {
		overloading obj = new  overloading();
		obj.test(5,10);
		obj.test1(100, 5);
		
	}

}
