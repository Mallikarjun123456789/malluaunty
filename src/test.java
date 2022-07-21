
public interface test {
	
	int a=30;// by default static final public
	int b=45;
	public void demo();
	
	void demo1();// by default public
	
	
	public static void demo3()//
	{
		System.out.println("helloooo");
		
	}
	
	public static void main(String[] args) {
		System.out.println(test.a);
		System.out.println(test.b);
	}

}
