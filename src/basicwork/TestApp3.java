package basicwork;

import java.util.Scanner;

public class TestApp3 {
	public static void main(String[] args) {
		
		int i,count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no : ");
		int no = sc.nextInt();
		
		for(i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count ==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not  a Prime number");
		}
		
		
	}
}
