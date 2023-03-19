package javaprograms;

import java.util.Scanner;

public class CountTheWordsWhichContainAInit 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence= sc.nextLine();
		String ss[]=sentence.split(" ");
		int count=0;
		for (int i=0; i<ss.length;i++)
		{
			String word=ss[i];
			char ch[]=word.toCharArray();
			for (int j=0; j<ch.length;j++)
			{
				if(ch[j]=='a' || ch[j]=='A')
				{
					count++;
				}
			}
		}
		System.out.println("Number of words in sentence which contain a init "+count);
	}
}
