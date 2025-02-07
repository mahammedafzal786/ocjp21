package io.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestApp1 {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Mahammedafzal", 12);
		
		//s1 -----write ------file
		
		//Auto Closable Resource 
		try (

				FileOutputStream fout = new FileOutputStream("studentlist.txt");
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			//data---object--s1---->write--->file
			out.writeObject(s1);
			
			System.out.println("success");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
