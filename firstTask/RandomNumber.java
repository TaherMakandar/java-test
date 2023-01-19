package tasks1to7;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber 
{
	public static void main(String[] args) 
	{
		
		/*int a=10000;
		int b=100;
		int i=(int)(Math.random()*(a-b+1)+b);
		System.out.println(i);*/
		Random ran =new Random();
		int r=ran.nextInt(10000);
		System.out.println(r);
	}
}
