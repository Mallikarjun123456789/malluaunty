package day1;

public class memory {
	int a=20;// non static declaration save in heap area
	
	static int b=10;// declaration save static pool area;
	
	public void test()// hepa area
	{
		System.out.println("hello");// method area
		
	}
public static void test2()//static pool area
{
	System.out.println("hi");// method area
}
public static void main(String[] args) {
	memory obj =new memory();
	obj.test();
	memory.test2();// static ch call karla class ke name se call karna
	System.out.println(memory.b);
	System.out.println(obj.a);
}
}
