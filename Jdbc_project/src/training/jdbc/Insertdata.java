package training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insertdata {

	public static void main (String[] args){
		Connection conn = null;
		Statement smt = null ;
		try {
			Scanner s= new Scanner(System.in);
			System.out.println("enter your name ");
			String name = s.nextLine();
			System.out.println("enter your email ");
			String email = s.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-MVAAH0RI:1521:xe","system", "root");
			smt =conn.createStatement();
			String sql = " INSERT INTO HR.PRODUCTS values ( supplier_seq1.nextval , '" +  id + "','"+ name + "')";
			smt.executeUpdate(sql);
			System.out.println("record printed sucessfully");
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
	finally {
		try { conn.close();} catch(Exception e) { }

	}
}	
}

