import java.util.*;
class pro2
{
      public static void main(String srr[])
      {
	int i,j,res;
	Scanner s=new Scanner(System.in);
	S("enter the first number"):
	i=s.nextInt();
	System.out.println("enter the second number");
	j=s.nextInt();
	if(i<=20)
	{
		do
		{
		System.out.println("go ahead");
		i++;
		}
		while(i>20);
	res=i+j;
	System.out.println(res);
	}
	else
	{
	System.out.println("value of i is greater than 20 so re enter the value");
	}
      }
}

      