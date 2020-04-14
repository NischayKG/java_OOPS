import java.util.*;

class excpro28
{
   public static void main(String arr[])
   {
	try
	{ 
	   int i,j,res;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the numerator and denominatior respectively");
	   i=s.nextInt();
	   j=s.nextInt();
	   res=i/j;
	   System.out.println("Division result="+res);
	}
	
	catch(ArithmeticException e)
	{
	  System.out.println("CANNOT DIVIDE BY ZERO");
	}
	finally
	{
	    System.out.println("Program Over");
	}
   }
}
