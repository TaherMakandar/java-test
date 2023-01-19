package tasks1to7;

import java.util.Scanner;

public class GradeSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks");
		try
		{
			int num=sc.nextInt();
			if(num>=80)
			{
				System.out.println("A");
			}
			else if(num<80 && num>=60)
			{
				System.out.println("B");
			}
			else if(num<60 && num>=40)
			{
				System.out.println("C");
			}
			else
				System.out.println("d");
		}
		catch(Exception e)
		{
			System.out.println("Enter the valid input");
		}
	}
}
