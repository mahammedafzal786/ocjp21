package basic;

import java.util.Scanner;


//String and String length() 
public class TestApp4 {
	public static void main(String[] args) {
		
		String name  = null;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		
		System.out.println("Name : "+name );
		
		System.out.println("name.length"+name.length());
	}
}
