package innerclasstopic.ai;

public class TestApp2 {
	public static void main(String[] args) {
		B obj = new B() {
			
			@Override
			public void test1() {
				System.out.println("B-----test1()");
			}
		};
		obj.test1();
	}
}
