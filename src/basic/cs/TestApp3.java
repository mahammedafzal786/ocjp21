package basic.cs;

import java.util.Scanner;


//Ladder if..else 
public class TestApp3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
	
		if(no > 0) {
			//trueBased  Statement
			System.out.println("No is Positive."+no);
		}else if(no < 0 ) {
			//falseBased Statement
			System.out.println("No is Negative"+no);
		}else {
			System.out.println("No is Zero : "+no);
		}
	
		System.out.println("General Statement.");
	}
}
