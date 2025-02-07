package jdbctopic.util;

import java.sql.Connection;

public class TestApp1 {
	public static void main(String[] args) {
		Connection conn = DBConnection.getConnection();
		
		//5) Validate Connection 
		if(conn != null) {
			System.out.println("DB Connected : "+conn);
		}else {

			System.out.println("DB Not Connected : "+conn);
		}
		
	}
}
