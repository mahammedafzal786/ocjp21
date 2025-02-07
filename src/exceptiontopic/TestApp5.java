package exceptiontopic;

public class TestApp5 {
	public static void main(String[] args) {
		try {
			String name = "royal";
			System.out.println(name.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("StringIndexOutOfBoundsException-----Example");
	}
}
