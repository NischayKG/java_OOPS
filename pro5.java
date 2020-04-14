import java.util.*;
public class pro5
{
	public static void main(String arg[])
	{
	Scanner s=new Scanner(System.in);
	int n,a,rev=0,b;
	System.out.println("Enter the number u want to check for palindrom");
	n=s.nextInt();
	a=n;
	while(a!=0)
		{
		b=a%10;
		rev=(rev*10)+b;
		a=a/10;
		}
	System.out.println("The reversed number is"+rev);
	if(rev==n)
		{
		System.out.println("It is a palindrom number");
		}
	else
		{
		System.out.println("It is not a palindrom number");
		}
	}
}


		