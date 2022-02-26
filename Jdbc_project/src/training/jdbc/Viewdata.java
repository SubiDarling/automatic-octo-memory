package training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Viewdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement smt = null ;
		ResultSet r = null ;// used for fetching select queries 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-MVAAH0RI:1521:xe","system", "root");
			String sql = " select * from customers where email like ?";
			smt = conn.prepareStatement(sql);
		 smt.setString(1, "%lti%");
		 r = smt.executeQuery();
		 while(r.next())
			 {
			 int id = r.getInt("customer_id");
			 String name = r.getString("customer_name");
			 String email = r.getString("email");
			 System.out.println(id + "," + name +" ,"+ email );
			 }
		}catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
	finally {
		try { conn.close();} catch(Exception e) { }

	}
	}

}
