package exceptiontopic;

import java.util.Scanner;

public class TestApp9 {
	public static void main(String[] args) 
	{
		int no1,no2,ans=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		no1=  sc.nextInt();
		System.out.println("Enter No2 : ");
		no2=  sc.nextInt();
		
		try 
		{
			ans = no1 / no2;
			
			String name = null;
			System.out.println("name.length() : " + name.length());
			
			int a[] = new int[5];
			
			a[5] = 10;
			
			String value = "1a2b3";
			int no = Integer.parseInt(value);
			System.out.println("No : " + no);
			
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException  e) 
		{
			e.printStackTrace();
		}

	
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Division : " + ans);
	}
}
