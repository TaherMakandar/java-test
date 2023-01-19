package tasks8to22;

import java.io.File;
import java.io.FileInputStream;

public class ReadFile 
{
	public static void main(String[] args) 
	{
		String path="D:\\FileHandling\\file.txt";
		try
		{
			File file=new File(path);
			FileInputStream fip = new FileInputStream(file);
		
			System.out.println("File content is : ");
			int c=0;
			while((c=fip.read())!=-1)
			{
				System.out.print((char)c);
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
}
