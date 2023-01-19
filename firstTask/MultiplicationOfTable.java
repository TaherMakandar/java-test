package tasks1to7;

import java.util.Scanner;

public class MultiplicationOfTable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		try
		{
			int a=sc.nextInt();
			
			int mul=0;
			for(int i=1;i<=10;i++)
			{
				System.out.println(a +"*"+i+"=" +a*i );
				 
			}
		}
		catch(Exception e)
		{
			System.out.println("not valid input");
		}
		
	}
}
