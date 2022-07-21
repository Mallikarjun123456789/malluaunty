package unary;

public class Nestedif {
	public static void main(String[] args) {
		int marks=101;
		
		if(marks>=100)//outer if
		{
			if(marks>=20) //inner if
			{
				System.out.println("you are passed");
			}
			else
			{
				System.out.println("your faild");
			}
		}
		else
		{
			System.out.println("invalid marks");
		}
	}

}