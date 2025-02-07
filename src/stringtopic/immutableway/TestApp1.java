package stringtopic.immutableway;

public class TestApp1 {
	public static void main(String[] args) {
		
		
		
		//.1) By String Literal Way [RAM---"HEAP"---"SCP"[String Constant Pool}:-
		String name1 = "Royal";
		String name2 = "Royal";
		String name3 = "Technosoft";
		String name4 = "Technosoft";
		
		
		System.out.println("name1==name2"+name1==name2);//true
		System.out.println("name1==name3"+name1==name3);//false
		System.out.println("name2==name"+name1==name4);//false
		
		name1 = name4;
		
		System.out.println("name1==name4"+name1==name4);
		
		
		System.out.println("name1.equals(name2)"+name1.equals(name2));//false
		System.out.println("name1.equals(name3)"+name1.equals(name3));//true
		System.out.println("name1.equals(name4)"+name1.equals(name4));//true
		System.out.println("name2.equals(name4)"+name1.equals(name4));//false
		System.out.println("name3.equals(name4)"+name1.equals(name4));//true
		
		
		
		

		//.2)By "new" keyword Way {RAM-----Heap]:-
		
//		String name1 = "Royal";
//		String name2 = "Royal";
//		String name3 = "Technosoft";
//		String name4 = "Technosoft";
//		
		
//		System.out.println("name1.equals(name2)"+name1.equals(name2));//false
//		System.out.println("name1.equals(name3)"+name1.equals(name3));//true
//		System.out.println("name1.equals(name4)"+name1.equals(name4));//true
//		System.out.println("name2.equals(name4)"+name2.equals(name4));//true
//		
//		
//		
//
//		System.out.println("name1.equals(name2)"+name1.equals(name2));//false
//		System.out.println("name1.equals(name3)"+name1.equals(name3));//true
//		System.out.println("name1.equals(name4)"+name1.equals(name4));//true
//		System.out.println("name2.equals(name4)"+name1.equals(name4));//false
//		System.out.println("name3.equals(name4)"+name1.equals(name4));//true
		
		
	}
}
