class a
{
	int i=0;
	public a()
	{
	i++;
	}
	public void disp()
	{
	System.out.println("The value of i is now="+i);
	}
}

public class pro24
{
	public static void main(String arr[])
	{
	System.out.println("Enter the number of objects you want to create");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int j=1,j<=n;j++)
		{
		a obj[j]=new a();
		obj[j].disp();
		}
	}
}
	
