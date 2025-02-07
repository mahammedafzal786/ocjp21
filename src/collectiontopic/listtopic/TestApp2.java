package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Mahammedafzal",12);
		Student s2 = new Student(2, "Akhtar",10);
		Student s3 = new Student(3, "Zaid",2);
		Student s4 = new Student(4, "Faiz",5);
		Student s5 = new Student(5, "Saif",8);
		
		
		ArrayList<Student> listObj = new ArrayList<Student>();
		
		
		listObj.add(s1);
		listObj.add(s2);
		listObj.add(s3);
		listObj.add(s4);
		listObj.add(s5);
		
		Iterator<Student> itr = listObj.iterator();
		
		while (itr.hasNext()) {
			Student s  = itr.next();
			
			System.out.println(s);
			
		}
		
	}
}
