package studentinformation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertingValue 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sit","root","root");
		PreparedStatement ps =con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student s_no");
		int s_no=sc.nextInt();
		System.out.println("Enter the student name");
		String name=sc.next();
		System.out.println("Enter the m1 marks");
		int m1=sc.nextInt();
		System.out.println("Enter the m2 marks");
		int m2=sc.nextInt();
		System.out.println("Enter the m3 marks");
		int m3=sc.nextInt();
		
		
		int total=m1+m2+m3;
		int avg=total/3;
		
		ps.setInt(1, s_no);
		ps.setString(2, name);
		ps.setInt(3, m1);
		ps.setInt(4, m2);
		ps.setInt(5, m3);
		ps.setInt(6, total);
		ps.setInt(7, avg);
		
		ps.executeUpdate();
		
		con.close();
		System.out.println("Values Inserted into table");
		
	}
}
