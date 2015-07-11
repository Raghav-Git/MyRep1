package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample1 {

	public static void main(String[] argv) {
		ConnectToMySQL();
	}

	public static void ConnectToMySQL(){
		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver Jar?");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager
					.getConnection("jdbc:mysql://10.10.200.151:3411/cp20","cp20_stag_user", "h4yA9eSw");
			//.getConnection("jdbc:mysql://localhost:3306/mkyongcom","root", "password");

			System.out.println(connection);
			
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		try{
		Statement stmt = connection.createStatement();
		System.out.println("Created DB Connection....");
		
		ResultSet rs=stmt.executeQuery("select * from users limit 10");  
		  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		  
		connection.close();  
		}catch(Exception e){
			try{
			connection.close();
			}catch(SQLException sqlExp){
				System.out.println(sqlExp);
			}
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			
		}

	}
}
