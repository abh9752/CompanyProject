package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		System.out.println(DbConnection.getDb());

	}
	
	public static Connection getDb()
	{
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="8888";
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection(url, user, password);
		
		
		} catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no Connection");
			e.printStackTrace();
		}
		
		return conn;
	}

}