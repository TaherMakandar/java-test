package tasks8to22;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Reverse the number using while loop
		int a=sc.nextInt();
		int rev=0;
		while(a!=0)
		{
			int last=a%10;
			rev=(rev*10)+last;
			a=a/10;
		}
		System.out.println(rev);
		//Reverse the number using for loop
		int num=sc.nextInt();
		int rev1=0;
		for(;num!=0;)
		{
			int last=num%10;
			rev1=(rev1*10)+last;
			num/=10;
		}
		System.out.println(rev1);
		
		
		reverseNumber(a);
	}
	//Reverse the number using recusion
	public static void reverseNumber(int n)
	{
		if(n<10)
		{
			 System.out.println(n);
		}
		else
		{
			System.out.print(n%10);
			
			 reverseNumber(n/10);
		}
	}
}
