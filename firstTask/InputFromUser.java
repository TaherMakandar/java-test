package tasks1to7;

import java.util.Scanner;

public class InputFromUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the first number");
			int a=sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			System.out.println("Total sum");
			int sum=a+b;
			System.out.println(sum);
			
		}
		catch(Exception e)
		{
			System.out.println("invalid input");
		}
		
	}
}
