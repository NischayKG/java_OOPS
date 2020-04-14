import java.util.*;
class a
{ 	int x;
 	public a()
 	{
 	System.out.println("constructor called");
 	}
 	public a(int a)
 	{
  	x=a;
  	System.out.println("The value u passed is="+x);
	}
}

public class conspro
{
	public static void main(String arr[])
	{
	int p;
	System.out.println("Enter the value u want to pass");
	Scanner s=new Scanner(System.in);
	p=s.nextInt();
	a obj2=new a(p);
	a obj1=new a();
	}
}
