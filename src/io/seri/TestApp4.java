package io.seri;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp4 {
	public static void main(String[] args) {

		try(
				FileInputStream fin = new FileInputStream("C:\\Users\\afzal\\eclipse-workspace\\ocjp21\\studentlist1.txt");
				
				ObjectInputStream oin = new ObjectInputStream(fin);
					
		)
		{
			Student s[] = (Student[]) oin.readObject();
			
			for (int i=0;i<s.length;i++) {
				s[i].disp();
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
