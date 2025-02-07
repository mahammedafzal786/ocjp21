package stringtopic.immutableway;

import javax.print.DocFlavor.STRING;

public class TestApp2 {
	public static void main(String[] args) {
		String name1 = "Royal";
		
		String name2 = new String("Royal");
		
		

		System.out.println("name1==name2"+name1==name2);//false
		
		System.out.println("name1.hashCode() : "+name1.hashCode());
		System.out.println("name2.hashCode() : "+name2.hashCode());
		
		System.out.println("System.identityHashCode(name1) : "+System.identityHashCode(name1));
		System.out.println("System.identityHashCode(name2) : "+System.identityHashCode(name2));
		
		
	}
}
