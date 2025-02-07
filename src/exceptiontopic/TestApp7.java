package exceptiontopic;

public class TestApp7 {
	public static void main(String[] args) {
		try {
			String value = "1a2b3";
			int no = Integer.parseInt(value);
			System.out.println("No : " + no);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("NumberFormatException---Eample");
	}
}
