package basicwork;

import java.util.Scanner;

public class TestApp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No : ");
		int no = sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			
			if(i%2==0) {
			System.out.println("Even No : "+i);
			}else {
				System.out.println("Odd No : "+i);
			}
		}
	}
}
