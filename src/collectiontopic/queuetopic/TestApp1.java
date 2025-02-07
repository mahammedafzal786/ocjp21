package collectiontopic.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 {
	public static void main(String[] args) {
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		
		
		queueObj.add("Mahammedafzal");
		queueObj.add("Zaid");
		queueObj.add("Akhtar");
		queueObj.add("Faiz");
		queueObj.add("Siaf");
		
		
		while(!queueObj.isEmpty()) {
			String name = queueObj.poll();
			
			System.out.println(name);
		}
	}
	
}
