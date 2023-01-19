package tasks8to22;

import java.util.Scanner;

public class DuplicateCharcterInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int count;
		
		char string[]=s.toCharArray();
		System.out.println();
		
		for(int i=0;i<s.length();i++)
		{
			count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j] && string[i]!=' ')
				{
					count++;
					string[j]='0';
				}
			}
			if(count>1 && string[i]!='0') 
			{
				System.out.println(string[i]);
			}
		}
	}
}
