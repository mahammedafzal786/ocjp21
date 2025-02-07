package collectiontopic.listtopic;

import java.util.ArrayList;

public class TestApp1 {
	public static void main(String[] args) {
		ArrayList<Object> listObj = new ArrayList<Object>();
		
		
		listObj.add(true);
		listObj.add('r');
		listObj.add(10);
		listObj.add(324L);
		listObj.add(12.21f);
		listObj.add(1234.324);
		listObj.add("Royal");
		
		
		Student s = new Student(1,"Mahammedafzal",12);
		
		listObj.add(s);
		
		System.out.println("listObj.size()"+listObj.size());
		
		listObj.stream().forEach(obj->System.out.println(obj));
		
		
	}
}
