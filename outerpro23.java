import java.util.*;
public class outerpro23
{	
    int i;
    public outerpro23()
    {
	System.out.println("Enter the value of i you want to input");
	Scanner s=new Scanner(System.in);
        i=s.nextInt();
    }
    public void dispout()
    {
	System.out.println("In outer class , the value of i is "+i);
	inner obj2 = new inner();
	obj2.dispin();
    }
		
    	public class inner
    {
	  int j;
	  public inner()
	{
	   System.out.println("Enter the value of j you want to print");
	   Scanner w=new Scanner(System.in);
	   j=w.nextInt();
	}
	  public void dispin()
	{
	   System.out.println("In inner class The value of i and j are "+i+" and "+j+" respectively");
	}
    }

     public static void main(String arr[])
     {
	outerpro23 obj1 = new outerpro23();
	
	obj1.dispout();
	
     }
}
	