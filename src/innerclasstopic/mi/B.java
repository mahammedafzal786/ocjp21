package innerclasstopic.mi;

public class B {
	private int no = 300;
	
	class C{
		private void show() {
			System.out.println("No : "+no);
		}
	}
	
	public static void main(String[] args) {
		B objB = new B();
		
		B.C obj = objB.new C();
		
		obj.show();
		
	}
}
