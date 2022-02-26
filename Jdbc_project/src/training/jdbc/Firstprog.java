package training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Firstprog {
 
	public static void main (String[] args)
	{
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// loading the jdbc driver //
			conn=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-MVAAH0RI:1521:xe","system", "root");
			System.out.println("system connected successfully ");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("It seems that jar is not in the class path , retry again ");
			}
	catch(SQLException e) {
		e.printStackTrace();
	}
	finally {
		try { conn.close();} catch(Exception e) { }

	
}
	}
}
