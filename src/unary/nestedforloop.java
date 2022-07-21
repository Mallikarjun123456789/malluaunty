package unary;

public class nestedforloop {
	public static void main(String[] args) {
		
		for (int a=1; a<=4; a++)//1 1+1=2 2+1=3 3+1=4 4+1=5
		{
			for(int b=4; b>0; b--)//1 1+1=2 2+1=3 3+1=4 4+1=5 5+1=6 false 
			{
				System.out.print(1);//1 1 1 1 1 2 2 2 2 2 3 3 3 3 3 4444 
			}
			System.out.println();
			}
		
		}
	}
