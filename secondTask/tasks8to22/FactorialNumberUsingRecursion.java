package tasks8to22;

public class FactorialNumberUsingRecursion 
{
	public static void main(String[] args) 
	{
		int a=4;
		System.out.println(factorial(a));
	}
	
	public static int factorial(int n)
	{
		
		if(n==0 || n==1)
		{
		 return 1;
			
		}
		else
		{
			return n*factorial(n-1);
		}
		
			
		
		
	}
	
}
