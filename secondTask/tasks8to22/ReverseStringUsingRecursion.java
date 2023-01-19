package tasks8to22;

import java.util.Scanner;

public class ReverseStringUsingRecursion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String s1=reverseString(s);
		System.out.println(s1);
	}
	public static String reverseString(String s)
	{
		if(s.isEmpty())
		{
			return s;
		}
		else
		
			return reverseString(s.substring(1))+s.charAt(0);
		
	}
}
