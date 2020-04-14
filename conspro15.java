class a
{
	int i,j,sum;
	public a(int a,int b)
	{
	i=a;
	j=b;
	sum=i+j;
	}
	public void disp()
	{
	System.out.println("The sum is ="+sum);
	}
}

public class conspro15
{
	public static void main(String arr[])
	{
	int p=10;
	int q=20;
	a obj1=new a(p,q);
	obj1.disp();
	}
}
