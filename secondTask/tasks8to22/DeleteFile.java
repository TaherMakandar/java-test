package tasks8to22;

import java.io.File;

public class DeleteFile 
{
	public static void main(String[] args) 
	{
		String path="D:\\FileHandling\\file.txt";
		File f = new File(path);
		f.delete();
	}
}
