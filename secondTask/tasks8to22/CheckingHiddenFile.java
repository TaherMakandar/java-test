package tasks8to22;

import java.io.File;

public class CheckingHiddenFile 
{
	public static void main(String[] args) 
	{
		File file = new File("D:\\FileHandling\\file.txt");
		if(file.isHidden())
		{
			System.out.println("File is hidden");
		}
		else
		{
			System.out.println("File is not hidden");
		}
	}
}
