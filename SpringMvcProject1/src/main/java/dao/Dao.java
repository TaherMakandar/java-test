package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao 
{
	public void Validate(int id ,String name, String role) throws ClassNotFoundException, SQLException {
	
	Connection con = null;
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring?autoReconnect=true&useSSL=false",
			"root", "root");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("insert into student values(1,'taher','softwareEngineer')");
con.close();
	
	}
	
	
}
