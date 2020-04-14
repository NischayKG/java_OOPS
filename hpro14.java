class a
{
	public void disp()
	{
	System.out.println("You are in base class a now");
	}
}


class b extends a
{
	public void disp()
	{
	System.out.println("You are in a derived class b now");
	super.disp();	
	}
}

public class hpro14
{
	public static void main(String srr[])
	{
	b obj=new b();
	obj.disp();
	}
}
