package collectiontopic.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp3 {
	public static void main(String[] args) {
	
		TreeSet< String> setObj = new TreeSet();
		
		setObj.add("Mahammedafzal");
		setObj.add("Zaid");
		setObj.add("Akhtar");
		setObj.add("Faiz");
		setObj.add("Siaf");
		
		
		Iterator<String> itr = setObj.iterator();
		
		while(itr.hasNext()) {
			
			String name  = itr.next();
			
			System.out.println(name);
		}
		
		System.out.println("---------------------------");
		
		setObj.stream().forEach(obj->System.out.println(obj));
		

		System.out.println("---------------------------");
		
		
		for (String name : setObj) {
			System.out.println(name);
		}
		
		
	}
}
