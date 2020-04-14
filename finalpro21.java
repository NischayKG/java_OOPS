class a
{
	final int i;
	public a()
	{
	i=0;
	}
	public void disp()
	{
	System.out.println("The value of I is now "+ i);
	}
}

public class finalpro21
{
	public static void main(String arr[])
	{
	for(int j=0;j<5;j++)
		{
		a obj=new a();
		obj.disp();
		}
	}
}	
