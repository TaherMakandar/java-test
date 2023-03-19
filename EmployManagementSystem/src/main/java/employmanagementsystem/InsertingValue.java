package employmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValue 
{
	public static void main(String[] args) throws ClassNotFoundException , SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/TibilEmployManagement","root","root");
		 Statement st =con.createStatement();
		 st.execute("insert into employdetails values(1,'Taher Makandar','SoftWareEngineer-Intern','2 Month',10000)");
		 st.execute("insert into employdetails values(2,'Shashank Gowda','SoftWareEngineer-Intern','2 Month',10000)");
		 st.execute("insert into employdetails values(3,'Deepika kv','SoftWareEngineer-Intern','2 Month',10000)");
		 System.out.println("inserted the values");
		 con.close();
	}
}
