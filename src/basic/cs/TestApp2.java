package basic.cs;

import java.util.Scanner;
//if..else
public class TestApp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
	
		if(no > 0) {
			//trueBased  Statement
			System.out.println("No is Positive : "+no);
		}else {
			//falseBased Statement
			System.out.println("No is Negative : "+no);
		}
	
		System.out.println("General Statement.");
	}
}
