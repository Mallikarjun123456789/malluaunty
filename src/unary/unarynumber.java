package unary;

public class unarynumber {
	public static void main(String[] args) {
		int a=1;
		System.out.println(a++);//1//2 ans1
		System.out.println(a++);//2 //3 ans3
		System.out.println(a=-a);//a=-3
		System.out.println(--a);//-3-1=-4 ans-4
		System.out.println(a--);//-4//-5 ans-4
		System.out.println(++a);//-5+1=-4 ans-4 
		System.out.println(a--);//-4//-5 ans-4
		System.out.println(a--);//-5//-6 ans-5
		System.out.println(++a);//-6+1=-5
	}

}

