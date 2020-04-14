public class cmd
{
	public static void main(String arr[])
	{	int a=0;
		for(int i=0;i<4;i++)
		{
		System.out.println(arr[i]);
		a+=Integer.parseInt(arr[i]);
		}
		System.out.println(a);

	}
} 