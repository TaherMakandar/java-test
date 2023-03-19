package studentinformation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDriver 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sit","root","root");
		Statement st =con.createStatement();
		st.execute("create table student(s_no int(10),name varchar(20),m1 double,m2 double,m3 double,Total int(10),percentage int(10))");
		System.out.println("Table is created");
		con.close();
	}
}
