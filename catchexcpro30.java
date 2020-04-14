import java.util.*;
class valid
{
   public void inrange(int n) throws Exception
   {
     if((n>0)&&(n<100))
       System.out.println("Its a number");
     else
	throw new Exception(n+" ");
   }
}

public class catchexcpro30
{
   public static void main(String arr[])
   {
	int i;
	System.out.println("Enter the value of i");
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	valid v=new valid();
	
	try
	{
	  v.inrange(i);
	}
	
	catch(Exception e)
	{
	 System.out.println("\nIn the catch block");
	 System.out.println("\n"+"please enter a number within 1 to 100"+"\n"+"now error displayed by the system is as follows :\n");
	 System.out.println(e.toString());
	 System.out.println("\nCatch block ends\n");
	}
	
	finally
	{ System.out.println("In the final block");
	  System.out.println("I is = "+i);
	  System.out.println("end of program and final block");
	}
    }
} 