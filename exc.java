import java.util.*;
class lion
{
	public void test(int n) throws Exception
	{
		if(n>0&&n<100)
		{
		System.out.println("the number you entered is :"+n);
		}
		else
		throw new Exception(n+" :  is not a number");
	}
}

public class exc
{
	public static void main(String arr[])
          {
	lion lo=new lion();
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	
	try
	{
	lo.test(num);
	}
	
	catch(Exception e)
	{
	System.out.println(e.toString());
	System.out.println(num+" : is out of bound");
	}
          } 
}


	





		