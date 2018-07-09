package com.mtc.hasya;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl ="jdbc:mysql://localhost/login_database?useSSl=false";
		String user = "root";
		String pass = "root";
		
		
		try {
			
			System.out.println("Connection to database"+ jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection Successful");
			
		}catch(Exception exe){
			exe.printStackTrace();
		}
	}

}
