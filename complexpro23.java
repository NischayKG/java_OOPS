import java.util.*;
class a
{
	int real,img;
	public void getdata(int r,int i)
	{
	real=r;	
	img=i;
	}
	public void sum(a ob1,a ob2)
	{
	a ob3=new a();
	ob3.real=ob1.real+ob2.real;
	ob3.img=ob1.img+ob2.img;
	System.out.println("\n\nThe sum of two complex number is="+ob3.real+"+i"+ob3.img);
	}
}

public class complexpro23
{
	public static void main(String srr[])
	{
	int p,q,r,t;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 1st complex number");
	p=s.nextInt();
	q=s.nextInt();
	a obj1=new a();
	obj1.getdata(p,q);
	System.out.println("Enter the 2nd complex number");
	r=s.nextInt();
	t=s.nextInt();
	a obj2=new a();
	obj2.getdata(r,t);
	a obj3=new a();
	obj3.sum(obj1,obj2);
	
	}
}

	