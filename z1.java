class z1
{
    public static void main(String arr[])
    {
	try
	{
	    char str[] = {'A','B','C','D'};
	    System.out.println(str[5]);
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
	    System.out.println("this is catch block");
	}
    }
}