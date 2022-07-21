package adavnace;

public class practice2 implements practice1 {
	
	public void mallu()
	{
		System.out.println("hi hello");
	}

	public void rutu()
	{
		System.out.println("byueyebeye");
	}
	
	public void prachi(int a,int b)
	{
		System.out.println(a+b);
	
	}
	
	public static void main(String[] args) {
		practice2 obj = new practice2();
		obj.mallu();
		obj.prachi(90,10);
		obj.rutu();
		
		
	}
	
	
}