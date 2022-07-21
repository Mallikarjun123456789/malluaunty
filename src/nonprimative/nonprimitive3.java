package nonprimative;

public class nonprimitive3 {
	public static void main(String[] args) {
		String a[]= {"velocity","katarj","pune"};
		String value =a[0];
		int len = value.length();
		
		for (int i=len-1; i>=0; i--)
		{
			System.out.print(value.charAt(i));
		}
		
	}

}
