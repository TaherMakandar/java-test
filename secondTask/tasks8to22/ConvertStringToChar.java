package tasks8to22;

import java.util.Scanner;

public class ConvertStringToChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.nextLine();
		
		for(int i=0;i<a.length();i++)
		{
			char b=a.charAt(i);
			System.out.println(b);
		}
		
	}
}
