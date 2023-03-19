package javaprograms;

import java.util.Scanner;

public class SumOfGivenArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size,i,sum=0;
		System.out.println("Enter the number elements in array");
		size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the "+size+" elements of an  array");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}
