class ex2
{
	static int a =10;
	static int b = 20;
	static
	{
		System.out.println("Static block a="+a);
		System.out.println("Static block b="+b);
	}
	public static void main(String arr[])
	{	
		ex2 e=new ex2();
		System.out.println("Main block a="+e.a);
		System.out.println("Main block b="+e.b);
	}
	
}	