import java.util.*;
class userdefclass extends Exception
{
   userdefclass(int wrongnum)
   {
     super(wrongnum+"is not a valid number");
   }
} 


class valid          //this class is to throw user defined exception
{
  public void inrange(int n) throws Exception
  {
   if(n>0&&n<=100)
      System.out.println("Its a number within a range 0 to 100");
   else
      throw new userdefclass(n);
   }
}






public class userexcpro31      //To catch the user defined exception
{
   public static void main(String arr[])
    {
	int num;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	num=s.nextInt();
	valid v=new valid();
	try
	{
	  v.inrange(num);
	}
	
	catch(Exception e)
	{
	  System.out.println("\nIn the catch block");
	  System.out.println("\nPlease enter a number within a range of 1 to 100");
	  System.out.println( "\nNow going to the user defined class\n");
	  System.out.println(e.toString());
	  System.out.println("Comming back to catch block");
	  System.out.println("\nEnd of catch block\n");
	}
	
	finally
	{
	  System.out.println("\nIn the final block\n");
	  System.out.println("\tNumber ="+num);
	  System.out.println("\nEnd of program and final block\n");
	}
     }
}
	

	  
   
   
   