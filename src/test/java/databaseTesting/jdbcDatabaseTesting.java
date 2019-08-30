package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/*A) create connection
B) create statement
C) execute statement
D) close connection*/


public class jdbcDatabaseTesting {
	
	public static void main(String [] arges) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Root1234");
		System.out.println("we are connected " + con);
		
		Statement stat= con.createStatement();
		
		//insert
		//String sert="insert into country(country) values('Ghana')";
		
		//update
		//String sert="update country set country ='Ghana1' where country_id=110";
		//You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'WHERE country_id=110' at line 1
		String sert="DELETE country WHERE country_id=110";
		//select command is 2 directional requires resultset
		stat.executeQuery(sert);
		
		//it executes then returns value. all the others don't
		//stat.executeUpdate(sert);
		System.out.println("we are inserting " + sert);
	
		
		//close cont
		con.close();
		
		
	
	}

}
