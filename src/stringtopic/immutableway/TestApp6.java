package stringtopic.immutableway;

public class TestApp6 {

	public static void main(String[] args) {
		String name ="Royal Technosoft Private Limited";
		System.out.println("name : "+name);
		
		String value1 = name.substring(6,16);
		System.out.println("value1 :"+value1);
		

		String value2 = name.substring(6);
		System.out.println("value2 :"+value2);
		
		
		String nameInLowerCase = name.toLowerCase();
		System.out.println("nameInLowerCase : "+nameInLowerCase);
		
		String name1 ="royal technosoft private limited";
		System.out.println("name1 : "+name1);
		
	}
	
}
