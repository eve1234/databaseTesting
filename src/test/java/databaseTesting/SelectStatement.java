package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectStatement {
	
	public static void main(String [] args) throws SQLException {
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Root1234");
	System.out.println("we are connected " + con);
	
	Statement stat= con.createStatement();
	
	String sert="select * From country";
	
	ResultSet ret=stat.executeQuery(sert);
	//select command is 2 directional requires resultset
	//it executes then returns value. all the others don't
	//stat.executeUpdate(sert);
	while(ret.next()) {
		String count=ret.getString("country");
		System.out.println("we are inserting " + count);
	}//end of while
	
	//close cont
	con.close();
	
	}

}
