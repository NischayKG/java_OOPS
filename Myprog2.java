import java.lang.reflect.*;
class Myprog1
{
	private int x;
	String name; 
	public Myprog1()
	{
		System.out.println("Default Constructor");
	}
	void display1()
	{
		System.out.println("hello");
	}
	void display2()
	{
		System.out.println("bye");
	}
}

class Myprog2
{
	public static void main(String arr[]) throws Exception
	{
		Class c=Class.forName("Myprog1");
		System.out.println("Class name is-:"+c.getName());
		System.out.println("Constructor name is-:"+c.getConstructor());
		 Field f[]=c.getDeclaredFields();
		System.out.println("Data fields are-:");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		Method m[]=c.getDeclaredMethods();
		System.out.println("Methods are-:");
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}
}

		