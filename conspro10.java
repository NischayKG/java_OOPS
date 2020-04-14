import java.util.*;
class a
{
	int i,j,res;
	public a()
	{
	i=0;
	j=0;
	res=0;
	}
	public void disp(int a,int b)
	{
	i=a;
	j=b;
	res=i+j;
	System.out.println("the sum is="+res);
	}
}

public class conspro10
{
	public static void main(String arr[])
	{
	int p,q;
	System.out.println("Enter the number whose sum u wan a obtain");
	Scanner s=new Scanner(System.in);
	p=s.nextInt();
	q=s.nextInt();
	a obj1=new a();
	obj1.disp(p,q);
	}
}