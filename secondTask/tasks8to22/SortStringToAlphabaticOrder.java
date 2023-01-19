package tasks8to22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortStringToAlphabaticOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		Arrays.sort(arr);
		
		System.out.println(arr);
		/*char temp;
		int i=0;
		while(i<arr.length)
		{
			int j=i+1;
			while(j<arr.length)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j=j+1;
			}
			i=i+1;
		}*/
		//System.out.println(arr);
	}
}
