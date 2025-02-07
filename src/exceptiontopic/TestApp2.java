package exceptiontopic;

import java.util.Scanner;

public class TestApp2 {
	public static void main(String[] args) {
		
		
		
		//ArithmeticException
		int no1,no2,ans=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		no2 = sc.nextInt();
		
		
		
		try {
			
		ans = no1/no2;

		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Division : "+ans);
	}
}
