import java.util.*;
class a
{
  int q=10;
   public void disp(int f) throws Exception
   {
     System.out.println("The value of q is ="+q+"\n Now the un declared variable\n");
     System.out.println(p);
     throw new NullPointerException(p);
   } 
}


public class excpro32
{
   public static void main(String arr[])
   {
     Scanner s = new Scanner(System.in);
     int i=s.nextInt();
     a obj=new a();
     try
	{
	  
	   obj.disp(i);
	 }   
     catch(NullPointerException e)
	{
	  System.out.println("in the catch block"); 
	  System.out.println("\nVariable not declared\n"+"\n"+"Now error given by the system\n");
	  System.out.println(e.toString()); 
	  System.out.println("catch block over");
	}
    }
}

