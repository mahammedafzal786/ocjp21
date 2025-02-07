package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp3 {
	public static void main(String[] args) {
		ArrayList< String> list = new ArrayList<String>();
		
		list.add("Mahammedafzal");
		list.add("Zaid");
		list.add("Akhtar");
		list.add("Faiz");
		list.add("Siaf");
		
		System.out.println(list);
		
		
		Collections.sort(list);
		
		System.out.println(list);
 	}
}
