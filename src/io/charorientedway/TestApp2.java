package io.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();		
		try {
			
			FileReader fr = new FileReader("C:\\Users\\afzal\\eclipse-workspace\\ocjp21\\Royal.txt");
			
			int temp;
			
			while((temp = fr.read()) != -1) {
				char value = (char) temp;
				sb.append(value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Final String : "+sb);
	}
}
