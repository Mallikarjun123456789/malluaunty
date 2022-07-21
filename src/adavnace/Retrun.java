package adavnace;

public class Retrun {
String s= "mallikarjun";

public int addition (int a,int b)
{
	int c=a+b;
	return c;
}

public void multiply(int c)
{
	int d=c*10;
	System.out.println(d);
}
public  String add()
{
	int t=90;
	String p= s.concat("nipani");
	return p;
}

public static void main (String[] args) {
	Retrun obj = new Retrun();
	int result =obj.addition(9,15);
	obj.multiply(result);
	String q= obj.add();
	System.out.println(q);
}
}
