import java.util.*;
class A
{
	public void disp()
	{
	System.out.println("This is class A");
	}
}

class B
{
	public void disp(int o)
	{
	System.out.println("The value you passed is"+"="+o);
	}
}	
public class pro9
{
	public void disp()
	{
	System.out.println("This is base class");
	}
	public static void main(String arr[])
	{
	int i;
	System.out.println("Enter the value you want to print ");
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	A a=new A();
	a.disp();
	B b=new B();
	b.disp(i);
	pro9 p=new pro9();
	p.disp();
	}
}