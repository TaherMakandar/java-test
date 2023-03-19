package javaprograms;

import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println("The reversed String : "+s1);
		
		if(s.equals(s1))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not a palindrome");
	}
}
