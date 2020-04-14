import java.util.*;
class a
{
	public void swap(int x,int y)
	{
	int temp=x;
	x=y;
	y=temp;
	System.out.println("the swaped value in swap function is="+x+" and "+y);
	}
}

public class swappro16
{
	public static void main(String arr[])
	{
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the values of u want to swap");
	a=s.nextInt();
	b=s.nextInt();
	a obj=new a();
	System.out.println("the value before swaping is="+a+" and "+b);
	obj.swap(a,b);
	System.out.println("After swaping="+a+" and "+b);
	}
}