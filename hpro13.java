class a
{
	public void disp()
	{
	System.out.println("You are in base class a");
	}
}


class b extends a
{	
}

public class hpro13
{
	public static void main(String srr[])
	{
	b obj=new b();
	obj.disp();
	}
}
