package tasks8to22;

import java.io.File;
import java.sql.Date;
import java.sql.Time;

public class LastModifiedDateAndTimeOfFile 
{
	public static void main(String[] args) 
	{
		File file =new File("D:\\FileHandling\\file.txt");
		Long lastmodified=file.lastModified();
		Date date=new Date(lastmodified);
		Time time=new Time(lastmodified);
	
		System.out.println(date);
		System.out.println(time);
	}
}
