package nonprimative;

public class chidclass extends parentclass {
	int c=30;
	 public void demo()
	 {
		 System.out.println("i am the child property");
		 
	 }

	 public static void main(String[] args) {
		 
		 chidclass obj1 =new chidclass();
		 obj1.demo();
		 obj1.test();// property of parent class is called with child class due to inheritance
		 
		
	}
}
