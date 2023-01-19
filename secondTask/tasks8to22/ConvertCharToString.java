package tasks8to22;

import java.util.Scanner;

public class ConvertCharToString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Charcter");
		char ch=sc.next().charAt(0);
		//String s= String.valueOf(ch);
		String s=Character.toString(ch);
		System.out.println(s);
	}
}
