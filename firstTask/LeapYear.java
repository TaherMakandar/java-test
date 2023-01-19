package tasks1to7;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		try
		{
			int year=sc.nextInt();
			if(year%4==0)
			{
				System.out.println("it is leap year");
			}
			else
			{
				System.out.println("not a leap year");
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter the correct input");
		}
	}
}
