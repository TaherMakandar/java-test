package tasks8to22;

import java.io.File;

public class ReadFileOnlyInJava 
{
	public static void main(String[] args) 
	{
		File file =new File("D:\\FileHandling\\file.txt");
		boolean flag =file.setReadOnly();
		
		if(flag==true)
		{
			System.out.println("File is setted as read only");
		}
		else
		{
			System.out.println("File is not setted for read only");
		}
		
	}
}
