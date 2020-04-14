import java.util.*;
class pro4
{
    public static void main(String arr[])
    {
	Scanner s=new Scanner(System.in);
	int i,j,k;
	System.out.println("enter the number whose table u want to obtain");
	i=s.nextInt();
	System.out.println("your table is as follows");
	for(j=1;j<=10;j++)
	{
	k=i*j;
        System.out.println(k);
        }
    }
}

	