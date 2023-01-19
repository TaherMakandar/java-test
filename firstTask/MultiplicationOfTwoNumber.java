package tasks1to7;

import java.util.Scanner;

public class MultiplicationOfTwoNumber 
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
			System.out.println("Multiplication of two number");
			int mul=a*b;
			System.out.println(mul);
		}
		catch(Exception e)
		{
			System.out.println("Enter valid input");
		}
	}
}
