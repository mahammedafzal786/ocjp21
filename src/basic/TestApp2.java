package basic;

import java.util.Scanner;


//Addition(+) , Subtraction(-) , Multiplication(*) ,Division(/) 
public class TestApp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NO1 : ");
		int num1 = sc.nextInt();

		System.out.println("Enter NO2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition : "+(num1 + num2));

		System.out.println("Subtraction : "+(num1 - num2));

		System.out.println("Multiplication : "+(num1 * num2));

		System.out.println("Division : "+(num1 / num2));
	}
}
