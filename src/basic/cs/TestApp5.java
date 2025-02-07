package basic.cs;

import java.util.Scanner;


//switch ----- Menu Driven Programming
public class TestApp5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		System.out.println("Enetr below Choise : ");
		System.out.println("1) For Addition");
		System.out.println("2) For Subtraction");
		System.out.println("3) For Multiply");
		System.out.println("4) For Division");
		
		int choise = sc.nextInt();
		
		int ans;
		
		switch (choise) {
		case 1: 
			ans = no1 + no2;
			System.out.println("Addition : "+ans);
			break;
		case 2: 
			ans = no1 - no2;
			System.out.println("Subtraction : "+ans);
			break;
		case 3: 
			ans = no1  * no2;
			System.out.println("Multiply : "+ans);
			break;
		case 4: 
			ans = no1 / no2;
			System.out.println("Divisio : "+ans);
			break;
		default:
			System.out.println("Invalid Choise ,\n \t Please enter between 1 to 4");
		}
	}
}
