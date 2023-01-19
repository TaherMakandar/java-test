package tasks8to22;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteFile 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{

			FileWriter enter =new FileWriter("D:\\FileHandling\\file.txt");
			System.out.println("Add the text");
			enter.write(sc.nextLine());
			System.out.println("File is added with text");
			enter.close();
		}
		catch(Exception e)
		{
			System.out.println();
		}
		
	}
}
