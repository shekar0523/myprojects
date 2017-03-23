package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class mysqlconnection {

	public static void main(String[] args) throws SQLException {
		//url="jdbc:mysql"+host+":"+port+"/databasename";
		String url="jdbc:mysql://localhost:3306/seleniumintro";
		Connection con=DriverManager.getConnection(url,"root","password");
		Statement stmt=con.createStatement();
		String query="select * from selenintro";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()){
			System.out.println(rs.getString(1));
		//	System.out.println(rs.getString("fname"));
			
		}
		

	}

}
