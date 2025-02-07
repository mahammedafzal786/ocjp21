package io.seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 {
	public static void main(String[] args) {
	
		try(
				FileInputStream fin = new FileInputStream("C:\\Users\\afzal\\eclipse-workspace\\ocjp21\\studentlist.txt");
				
				ObjectInputStream oin = new ObjectInputStream(fin);
					
		)
		{
			Student s1 = (Student) oin.readObject();
			
			s1.disp();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
