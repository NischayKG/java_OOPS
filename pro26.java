import java.util.*;
class a
{

	int age;
	String name;
	int income;


	public a(int ag,String m,int in)
	{

	  age=ag;
	  name=m;
	  income=in;

	}

	public void disp()
	{
	  System.out.println("The AGE NAME and income are as follows\n\n");
	  System.out.println("AGE="+age+"\t"+"NAME="+name+"\t"+"INCOME="+income);
	}
}

public class pro26
{	
	public static void main(String arr[])
	{
	  int p;
	  String n;
	  int r;
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter age,name and income");

	  p=s.nextInt();
	  n=s.next();
	  r=s.nextInt();
	  a obj1 = new a(p,n,r);	  
          obj1.disp();
	}
}	