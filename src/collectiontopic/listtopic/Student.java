package collectiontopic.listtopic;


import java.util.Scanner;

public class Student {
	private int rno ;
	private String name;
	private transient int std;
	
	
	public Student() {
		
	}


	public Student(int rno, String name, int std) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	
	@Override
	public String toString() {
		return (rno +" "+" "+ name +" "+ std);
	}
	
	public void disp() {
		System.out.println(rno +" "+" "+ name +" "+ std);
	}
	
	
	public void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno :");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
}

