package basic;

import java.util.Scanner;


//Swap two numbers using temp variable
public class TestApp3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NO1 : ");
		int num1 = sc.nextInt();

		System.out.println("Enter NO2 : ");
		int num2 = sc.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2= temp;
		 
		System.out.println("NO1 : "+num1);

		System.out.println("NO2 : "+num2);
	}
}
