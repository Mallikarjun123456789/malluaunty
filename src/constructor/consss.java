package constructor;

public class consss {
	consss(int a, String b){
		System.out.println("hello i am cons");
	}
	public void test() {
		System.out.println("hello i am test");
		
	}
		public static void main(String[] args) {
			consss obj =new consss( 5, "hello");
			obj.test();
			
			obj.test();
			obj.test();
			consss obj2 =new consss (6,"hi");
			
			
			
		}
	}


