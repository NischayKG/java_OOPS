import java.util.*;
class A
{
   
   public void getdata()
    { int n;
      System.out.println("enter the size of the array");
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int p[];
      p = new p[n];
      System.out.println("now enter the elements of the array");
      for(int i=0;i<n;i++)
      {
	p[i]=s.nextInt();
      }
   }
   public void disp() throws Exception
    {
      int d;
      System.out.println("Enter the index number you want to access");
      Scanner h=new Scanner(System.in);
      d=h.nextInt();
      if(d<n)
      {
	System.out.println("the number is"+p[d]);
      }
      else
      {
        throw new ArrayIndexOutOfBounds(d);
      }
   }
}


public class excpro33
{
    public static void main(String arr[])
    {
	a obj = new a();
	obj.getdata();
	try
	{ System.out.println("In the try block");
	  obj.disp();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{ System.out.println("In the catch block\n");
	  System.out.println("Please enter the valid index number\n"+"now system display=");
	  System.out.println(e.toString()+"\n");
	  System.out.println("Catch block ends");	  
	}
    }
}    