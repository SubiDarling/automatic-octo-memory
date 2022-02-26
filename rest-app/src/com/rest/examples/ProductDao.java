package com.rest.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// class which consists of database interaction are reffered as DAO
//create a table with four columns tbl_product(id number , name varchar2(20) , price of the product(7,2) , quantity(3,2) 

public class ProductDao {

	public void insert(Product product) {
		Connection conn = null;
		PreparedStatement smt = null ;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-MVAAH0RI:1521:xe","system", "root");
			String sql = " INSERT INTO HR.PRODUCTS1  values (?,?,?,?)";
			smt =conn.prepareStatement(sql);	
			smt.setInt(1,product.getId());
			smt.setString(2, product.getName());
			smt.setDouble(3, product.getPrice());
			smt.setInt(4,product.getQuantity());
			smt.executeUpdate();
			System.out.println("added successfully");
					
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
			System.out.println("It seems that jar is not in the class path , retry again ");
		}
	finally {
		try { conn.close();} catch(Exception e) { }

	}

}
}

