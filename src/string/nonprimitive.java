package string;

public class nonprimitive {
	public static void main(String[] args) {
		String a= "Velocity";
		String b=new String ("velocity");
		
		System.out.println(a.charAt(6));
		int len =a.length();
		System.out.println(len);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		boolean result =a.equals(b);
		System.out.println(result);
		boolean result1=a.equalsIgnoreCase(b);
		System.out.println(result1);
		System.out.println(a);
		System.out.println(a.concat (" katarj"));
		String c=a.toLowerCase();
	    boolean v=a.contains("lo");
	    System.out.println(v);
	    System.out.println(a.substring(1));
	}

}
