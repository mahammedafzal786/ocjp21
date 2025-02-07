package innerclasstopic.li;

public class B {
	private  int no = 500;
	void disp() {
		 class C{
			void show() {
				System.out.println("No : "+no);
			}
		}
		 C objC = new C();
		 objC.show();
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.disp();
	}
}
