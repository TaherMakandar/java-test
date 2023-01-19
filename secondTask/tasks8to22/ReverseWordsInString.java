package tasks8to22;

import java.util.Scanner;

class ReverseWordsInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String[] word=s.split(" ");
		String s1="";
		for (String w:word)
		{
			String revstring="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revstring=revstring+w.charAt(i);
			}
			s1=s1+revstring+" ";
		}
		System.out.println(s1);
	/*	for(String w : word)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			s1=s1+sb.toString()+" ";
			
		}
		System.out.println(s1);*/
		
		
	}
}
