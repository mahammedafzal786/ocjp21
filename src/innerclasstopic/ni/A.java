package innerclasstopic.ni;

public class A {
	private static int no = 200;
	static class B{
		void show() {
			System.out.println("No : "+no);
		}
	}
	public static void main(String[] args) {
		A.B obj = new A.B();
		obj.show();
	}
}
