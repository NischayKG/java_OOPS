class a
{
	static int i=0;
	public a()
	{
	i++;
	}
	public void disp()
	{
	System.out.println("The value of I is now "+ i);
	}
}

public class staticpro19
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
