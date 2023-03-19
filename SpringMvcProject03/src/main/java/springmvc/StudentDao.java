package springmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import DTO.Employee;

public class StudentDao {

	
	
	public String userRegistration(String name, String branch, String contact, String email, String userName,
			String passWord) {

		Connection con = null;
		String result = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springmvc?autoReconnect=true&useSSL=false",
					"root", "root");
			Statement st = con.createStatement();
			int i = st.executeUpdate(
					"insert into user_details(Student_Name,Branch,Contact,Email,userName,passWord) values('" + name
							+ "','" + branch + "','" + contact + "','" + email + "','" + userName + "','" + passWord
							+ "')");

			if (i > 0) {
				result = userName;
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}

		return result;
	}

	
}
