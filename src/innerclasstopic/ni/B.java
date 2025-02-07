package innerclasstopic.ni;

public class B {
	private static int no = 4000;
	static class C {
		private void show() {
			System.out.println("No : "+no);
		}
	}
	
	public static void main(String[] args) {
		B.C obj = new B.C();
		
		obj.show();
	}
}
