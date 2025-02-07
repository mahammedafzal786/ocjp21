package basic.cs;

import java.util.Scanner;

//Nested if..else
public class TestApp4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		System.out.println("Enter No3 : ");
		int no3 = sc.nextInt();
		
		
		if(no1>no2){
			
			if(no1>no3) {
				System.out.println("No1 is max : "+no1);
			} else {
				System.out.println("No3 is max : "+no3);
			}
			
		} else {
			if(no2>no3) {
				System.out.println("No2 is max : "+no2);
			} else {
				System.out.println("No3 is max : "+no3);
			}
			
		}
	}
}
