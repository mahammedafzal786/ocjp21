package stringtopic.immutableway;

public class TestApp3 {
	public static void main(String[] args) {
		String name1 = "Royal";
		
		System.err.println("Name1 : "+name1+"----"+name1.hashCode());//Royal
		
        name1 = "Technosoft";
		
		System.err.println("Name1 : "+name1+"----"+name1.hashCode());//Technosoft
		
		
		//Immutable behavior
		name1.concat(" pvt ltd");//Technosoft pvt ltd
		System.err.println("Name1 : "+name1+"----"+name1.hashCode());//Terchnosoft
	}
}
