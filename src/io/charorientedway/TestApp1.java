package io.charorientedway;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.nextLine();
		
		try {
			FileWriter fw = new FileWriter("Royal.txt");
			
			fw.write(name);
			fw.close();
			System.out.println("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
