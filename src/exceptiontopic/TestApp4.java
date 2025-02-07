package exceptiontopic;

public class TestApp4 {
	public static void main(String[] args) {
		
		
		try {
			String name = null;
			System.out.println("name.length() : " + name.length());
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("StringIndexOutOfBoundsException-----example");
	}
}
