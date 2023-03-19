package studentinformation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayingGrade 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sit","root","root");
		PreparedStatement ps =con.prepareStatement("select * from student where  s_no=?");
		System.out.println("enter the id");
		int s_no=sc.nextInt();
		ps.setInt(1, s_no);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			if(rs.getInt(3) <35 || rs.getInt(4)<35 || rs.getInt(5)<35)
			{
				System.out.println(rs.getString(2)+" F");
			}
			else if(rs.getInt(3) >=50 || rs.getInt(4)>=50 || rs.getInt(5)>=50  )
			{
				System.out.println(rs.getString(2)+" B");
			}
			else if(rs.getInt(3)>35 && rs.getInt(4)>35 && rs.getInt(5)>35 )
			{
				System.out.println(rs.getString(2)+" C");
			}
			
			else
			{
				System.out.println(rs.getString(2)+"A");
			}
		}
		con.close();
	}
}
