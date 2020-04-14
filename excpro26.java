class excpro26
{
	public static void main(String arr[])
	{
		try
		{
		int i=20;
		i=i/0;
		}
		
		catch(Exception e)
		{
		System.out.println(e.toString());
		}
	}
}