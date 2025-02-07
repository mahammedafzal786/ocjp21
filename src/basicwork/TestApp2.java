package basicwork;

import java.util.Scanner;

public class TestApp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int no = sc.nextInt();
		no = no/10;
		int rem;
		int sum = 0;
		for(;no>9;) {
			rem = no%10;
			sum = sum +rem;
			no = no/10;
		}
		System.out.println("sum of middle no is : "+sum);
	}
}
