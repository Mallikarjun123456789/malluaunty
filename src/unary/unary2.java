package unary;

public class unary2 {
	public static void main(String[] args) {
		int a=2;
		System.out.println(a++);//2 //3 ans2
		System.out.println(a++);//3 //4 ans3
		System.out.println(a=-a);//a=-4
		System.out.println(--a);//-4-1=-5 ans-5
		System.out.println(a--);//-5//-6 ans-5
		System.out.println(++a);//-6+1=-5 ans-5
		System.out.println(a--);//-5//-6// ans-5
		System.out.println(a--);//-6//-7// ans-6
		System.out.println(++a);//-7+1=-6 ans-6
	}

}
