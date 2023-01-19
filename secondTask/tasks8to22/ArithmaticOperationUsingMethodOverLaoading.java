package tasks8to22;
import java.util.Scanner;
public class ArithmaticOperationUsingMethodOverLaoading 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArithmaticOperationUsingMethodOverLaoading a= new ArithmaticOperationUsingMethodOverLaoading ();
		try
		{
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			int number=sc.nextInt();
			
			switch(number)
			{
			case 1 : 
					m1();
			break;
			case 2 : 
					m1(1);
					break;
			case 3 :
					m1("a");
					break;
			case 4 :
					m1(0.0);
					break;
			default :
				System.out.println("invalid input");
						
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter the valid input");
		}
		
	}
	public static void m1()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		int add=num1+num2;
		System.out.println("addition "+"= "+add);
	}
	public static void m1(int a)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("================");
		
		System.out.println("enter the first number");
		int num3=sc.nextInt();
		System.out.println("enter the second number");
		int num4=sc.nextInt();
		int sub=num3-num4;
		System.out.println("Subtraction "+"= "+sub);
	}
	public static void m1(String b)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("================");
		
		System.out.println("enter the first number");
		int num5=sc.nextInt();
		System.out.println("enter the second number");
		int num6=sc.nextInt();
		int mul=num5*num6;
		System.out.println("Multiplication "+"= "+mul);
	}
	public static void m1(Double d)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("================");
		
		System.out.println("enter the first number");
		int num7=sc.nextInt();
		System.out.println("enter the second number");
		int num8=sc.nextInt();
		int div=num7/num8;
		System.out.println("Division "+"= "+div);
	}
}
