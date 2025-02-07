package innerclasstopic.li;

public class A {
	private int no = 100;
	void disp() {
		//Local Innerclass 
		class B{
			void show() {
				System.out.println("No : "+no);
			}
		}
		B objB = new B();
		objB.show();
	}
	
	public static void main(String[] args) {
		A  obj = new A();
		obj.disp();
	}
}
