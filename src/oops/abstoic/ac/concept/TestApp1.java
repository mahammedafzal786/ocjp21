package oops.abstoic.ac.concept;

public class TestApp1 {
	public static void main(String[] args) {
		
		A objA = new B();
		
		objA.test1();
		objA.test2();
		
		if(objA instanceof B) {
			B objB = (B)objA;
			
			objB.test3();
			
			((B)objA).test3();
		}
	}
}
