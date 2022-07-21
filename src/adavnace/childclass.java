package adavnace;

public class childclass extends parentclss {
	
	int c=30;
	int d=40;
	
	public void demo ()
	{
		System.out.println("hi everyone");
	}
	
	
	
	public  void test1() 
	{
	System.out.println("i m maddy the cool boy");	
	
	}
	
	public static void main(String[] args) {
		parentclss obj =new childclass();
		obj.test();
		obj.test1();
		
		
	}
	

}
