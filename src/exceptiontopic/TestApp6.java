package exceptiontopic;

public class TestApp6 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];//a[0],a[1],a[2],a[3],a[4]
			a[5] = 100;
			System.out.println("a[5] : " + a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("ArrayIndexOutOfBoundsException-------example");
	}
}
