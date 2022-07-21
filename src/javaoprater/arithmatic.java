package javaoprater;

public class arithmatic {
	public static void main(String[] args) {
		int amount=9;//price should 10 or equal to 10 lakh 
		int seat=8;// car should 7 seater or more
		int interest =8;
		
		boolean result= (amount<=10)&&(seat>=7);
		System.out.println(result);
		
		boolean orResult= (amount<=10)||(seat>=7)||(interest<=6);
		System.out.println(orResult);
	}

}
 