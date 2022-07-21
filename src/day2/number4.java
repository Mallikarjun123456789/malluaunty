package day2;

public class number4 {
	public static void main(String[] args) {
		int rows=5;
		int count =1;
		char ch1='A';
		char ch2='a';
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(count++%2==0)
				{
					System.out.println(ch1++);
					
				}
				else
				{
					System.out.println(ch2++);
					
				}
			}
			System.out.println();
				
		}
		
		
	}

}
