package training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallingProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection conn=null;
CallableStatement smt = null;
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-MVAAH0RI:1521:xe","system", "root");
smt = conn.prepareCall("{call query query_cust (? , ? , ?) }");
smt.setInt(1,5);
smt.registerOutParameter(2, Types.VARCHAR);
smt.registerOutParameter(3, Types.VARCHAR);
smt.execute();
System.out.println(smt.getString(2));
System.out.println(smt.getString(3));

   }catch(ClassNotFoundException|SQLException e)
{
	e.printStackTrace();
}
finally {
try { conn.close();} catch(Exception e) { }

}
}

}
