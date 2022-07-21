
public interface int2 {
	public void demo();// no need abstract key word
	
	// public void demo2();// cannot complete non static method
	
	public static void demo3()// we can write static method in interface
	
	{
		System.out.println("hello");
	}
	//public static void demo4() we cannot write incomplete static method
	
	public static void main(String[] args) {
		// int2 obj =new int2() // cannot create object of interface becouse of no constructor presnet
		
	}
}
