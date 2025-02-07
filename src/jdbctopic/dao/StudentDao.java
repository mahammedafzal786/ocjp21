package jdbctopic.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDao {
	
	public int insertStudent(StudentBean sbean) {
		
		int rowsAffected = 0;
		String insertQuery = "INSERT INTO student(name,std,marks) Values('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";
		Statement stmt = null;
		//1) get DB connection object
		Connection conn  = DBConnection.getConnection();
		
		//2) validate connection object
		if(conn != null) {
			try {	
				//3) create Statement----insert query execute 
				stmt = conn.createStatement();
				
				//4) insertQuery by executeUpdate method
				rowsAffected = stmt.executeUpdate(insertQuery);
				
				System.out.println("insertQuery :"+insertQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("StudentDao----------insertStudent()-----DB not Connected:"+conn);
		}
		return rowsAffected;
	}
	public int updateStudent(StudentBean sbean,int rno) {
		
		int rowsAffected = 0;
		String updateQuery = " UPDATE student SET name = '"+sbean.getName()+"',std = "+sbean.getStd()+",marks = "+sbean.getMarks()+" WHERE rno = "+rno+"";
		Statement stmt = null;
		
		Connection conn  = DBConnection.getConnection();
		
		if(conn != null) {
			try {	
		
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(updateQuery);
				
				System.out.println("insertQuery :"+updateQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("StudentDao----------updateStudent()-----DB not Connected:"+conn);
		}
		return rowsAffected;
		
	}
	public int deleteStudent(int rno) {
		
		String deleteQuery = "DELETE FROM student WHERE rno ="+rno;
		
		Statement stmt = null;
		
		Connection conn = DBConnection.getConnection();
		
		int rowsAffected = 0;
		
		if(conn != null) {
			try {	
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
				System.out.println("deleteQuery :"+deleteQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("StudentDao----------deleteStudent()-----DB not Connected:"+conn);
		}
		return rowsAffected;
		
	}
	public ArrayList<StudentBean> getAllStudentRecord() {
		
		String selectQuery = " SELECT * FROM student";
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt  = null;
		
		ResultSet rs = null;
		
		StudentBean sbean = null;
		
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		
		if(conn != null) {
			try {	
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) {
					
					int rno  = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
					sbean = new StudentBean(rno, name, std, marks);
					
					list.add(sbean);
					
				}
				
				System.out.println("selectQuery :"+selectQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("StudentDao----------getAllStudentRecord()-----DB not Connected:"+conn);
		}
		return list;
	}
	
	public StudentBean getStudentByName(String studentName) {
	String selecByName = " SELECT * FROM student WHERE name = '"+studentName+"'";
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt  = null;
		
		ResultSet rs = null;
		
		StudentBean sbean = null;
		
		if(conn != null) {
			try {	
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery(selecByName);
				
				rs.next();
					
					int rno  = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
					sbean = new StudentBean(rno, name, std, marks);
					
				System.out.println("selectQuery :"+selecByName);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("StudentDao----------getStudentByName()-----DB not Connected:"+conn);
		}
		
		return sbean;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentDao dao = new StudentDao();
		
		//-----------------------------selectStudentByName Query-------------------------------
		/*
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		
		StudentBean s  = dao.getStudentByName(name) ;
		

		System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
		
		*/
		
		//-----------------------------select Query-------------------------------
		
		
		
		ArrayList<StudentBean> list = dao.getAllStudentRecord();
		
		System.out.println("list.size() : "+list.size());
		
		
		for (int i = 0; i < list.size(); i++) {
			
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
			
		}
		
		
		
		//-----------------------------insert Query-------------------------------
		/*
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		System.out.println("Enter the std :");
		int std = sc.nextInt();
		System.out.println("Enter the marks :");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		//StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if(rowsAffected>0) {
			System.out.println("Student record inserted : "+rowsAffected);
		}else {
			System.out.println("Student record not inserted :"+rowsAffected);
		}
		
		/*
		
		
		//-----------------------------update Query-------------------------------
		/*
		System.out.println("Enter rno which you want to update : ");
		int rno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the std : ");
		int std = sc.nextInt();
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(rno, name, std, marks);
		
		 int  rowsAffected = dao.updateStudent(sbean, rno);
		
		 
		 if(rowsAffected>0) {
				System.out.println("Student record updated : "+rowsAffected);
		 }else {
				System.out.println("Student record not updated :"+rowsAffected);
		 }
		*/
		 
		//-----------------------------delete Query-------------------------------
		/*
		System.out.println("Enter the rno : ");
		int rno = sc.nextInt();
		
		 int rowsAffected = dao.deleteStudent(rno);
		 
		 if(rowsAffected>0) {
				System.out.println("Student record deleted : "+rowsAffected);
			}else {
				System.out.println("Student record not deleted :"+rowsAffected);
			}
		 
		 */
		
	}
}
 