package stringtopic.immutableway;

public class TestApp8 {
	public static void main(String[] args) {
		//Searching methods
		String name = "Royal Technosoft Private Limited";
		
		int index = name.indexOf("Technosoft");
		System.out.println("index :"+index);
		
		int index2 = name.lastIndexOf("Technosoft", 10);
		System.out.println("index2 :"+index2);
		
		
		int index3 = name.lastIndexOf("Technosoft");
		System.out.println("index3 :"+index3);
		
		
		
		boolean flag1 = name.startsWith("Royal");
		System.out.println("flag1 :"+flag1);
		
		boolean flag2 = name.endsWith("Limited");
		System.out.println("flag2 :"+flag2);
		
		boolean flag3 = name.contains("Technosoft");
		System.out.println("flag3 : "+flag3);
	}
}
