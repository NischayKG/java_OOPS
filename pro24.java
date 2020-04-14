


import java.util.*;

class a
{
	    int i=0;
	public a()
	{
	    i++;
	}
	public void disp()
	{
	    System.out.println("The number of object created is now= "+i);
	    i++;
	}
}

public class pro24
{
	public static void main(String arr[])
	{
	     System.out.println("Enter the number of objects you want to create");
	     Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     a obj=new a();
	     for(int j=1;j<=n;j++)
		{
		     obj.disp();
		}
	
	}


}
	

