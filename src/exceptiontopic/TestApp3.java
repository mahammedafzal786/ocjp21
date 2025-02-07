package exceptiontopic;

public class TestApp3 {
	public static void main(String[] args) {
//		NullPointerException
		try {
			
			String name = null;
			
			System.out.println("name.length() : " + name.length());
		
		} catch (NullPointerException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("NullPointerException----Example");
	}
}
