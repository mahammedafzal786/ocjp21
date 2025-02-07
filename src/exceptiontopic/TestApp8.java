package exceptiontopic;

public class TestApp8 {
	public static void main(String[] args) {
		try {
			A objA = new B();
			C objC = (C)objA;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("ClassCastException-Example");
	}
}
