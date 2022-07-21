package day1;

public class triangle {
	public void rightangle(int i)
	{
for (int a=1; a<=i; a++)
{
for (int b=1; b<=a; b++)
{
	System.out.print(" *");
}
System.out.println();
}
	}
public void reverseTriangle(int j)
{
	for(int a=1; a<=j; a++)
	{
		for (int b=j; b>=a; b--)
		{
			System.out.print(" *");
			
		}
	System.out.println();
	}
}
	public static void main(String[] args)
	{
		triangle obj =new triangle();
		obj.rightangle(5);
		obj.reverseTriangle(4);
	}
}


