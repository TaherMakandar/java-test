package tasks8to22;

import java.util.Scanner;

public class CheckPalindromeStringUsingRecursion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1=s;
		String s2=reverse(s);
		System.out.println(s2);
	
			if(s1.equals(s2))
			{
				System.out.println("It is palindrome");
			}
			else
			{
				System.out.println("It is not palindrome");
			}
		
		
	}
	static String reverse(String s)
	{
		if(s.isEmpty())
		{
			return s;
		}
		else
			
		return reverse(s.substring(1))+s.charAt(0);
	}
	
}
