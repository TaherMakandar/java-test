package javaprograms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OddAndEvenTxt 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence : ");
		String sentence = sc.nextLine();
		String splitSentence [] = sentence.split(" ");
		
		for(int i=0; i<splitSentence.length; i++)
		{
			String word = splitSentence[i];
			char ch [] = word.toCharArray();
			int letterCount = ch.length;
			
			if(letterCount%2==0)
			{
				FileWriter enterEvenText = new FileWriter("D:\\Text files\\even.txt", true);
				enterEvenText.write(word);
				enterEvenText.close();
			}
			else
			{
				FileWriter enterOddText = new FileWriter("D:\\Text files\\odd.txt", true);
				enterOddText.write(word);
				enterOddText.close();
			}
		}
		
		System.out.println("Entered into the file...");
	}
}
