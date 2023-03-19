package javaprograms;

public class PrimenumberUsingRecursion1 
{

  public static void main(String[] args) 
  {
	  int p[]= {5,35,47,58,67} ;
	    for(int i=0;i<p.length;i++)
	    {
	    	int p1=p[i];
	    	if (prime(p1, 2))
	    		System.out.println(p1);
	    	
	    }
  }
  static boolean prime(int a, int i)
  {

      if (a <= 2) 
         return (a == 2) ? true : false; 
     if (a % i == 0) 
         return false; 
     if (i * i > a)

          return true;
     
      return prime(a, i + 1);
  }
}
