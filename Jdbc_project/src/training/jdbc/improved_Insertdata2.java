package training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class improved_Insertdata2 {

	public static void main (String[] args){
		Connection conn = null;
		PreparedStatement smt = null ;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-MVAAH0RI:1521:xe","system", "root");
			String sql = " INSERT INTO HR.PRODUCTS values ( supplier_seq1.nextval , ?,?,?,?)";
			smt =conn.prepareStatement(sql);
	
		
			Scanner s= new Scanner(System.in);
			String ans = " ";
			do {
			System.out.println("enter your id ");
			int id  = s.nextInt();
			System.out.println("enter your name ");
			String name = s.nextLine();
			System.out.println("enter your price ");
			int price = s.nextInt();
			System.out.println("enter your wuantity ");
			int quantity = s.nextInt();
			smt.setInt(1,id);
			smt.setString(2, name);
			smt.setInt(3, price);
			smt.setInt(4, quantity);
			smt.executeUpdate();
			System.out.println("record printed sucessfully...do wish to continue(y/n) ?");
			ans=s.nextLine();
			
		}while(ans.contentEquals("y"));
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

