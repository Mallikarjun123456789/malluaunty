package nonprimative;

public class pallidrome {
	public static void main(String[] args) {
		int num=123, temp=num;
		int rev =0;
		while (num!=0)
		{
			int ld =num%10;
			rev= (rev*10)+ld;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("it is pallidrom");
		}
		else
		{
			System.out.println("it is not pallidrome");
		}
		
		}
		
	}












