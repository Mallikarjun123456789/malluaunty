package unary;

public class reverseno {
	public static void main(String[] args) {
		int num=54321;
		int rev=0;
	
		while(num!=0);
		{
			int digitv=num%10;
			rev=rev*10+ digitv;	
			num=num/10;
			}
		System.out.println("Reversed Number"+rev);
	}
		
	

}
