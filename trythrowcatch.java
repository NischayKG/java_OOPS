import java.util.*;
class  valid
{
	public void inrange(int num)throws Exception
	{
		if(num<0||num>100)
		System.out.println("the number is in range")
		else
		throws new Exception(num+"-number is not in range")	
	}
}

public void trythrowcatch
{
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		valid v=new valid();
		try
		{
			v.inrange(n);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("The number you entered is :"+n);
	}
}





	
				