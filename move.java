class A
{
  public void move()
  {
	System.out.println(" class A can move");
  }
}

class B extends A
{
	
		public void move()
		{
			System.out.println(" class B can move");
		}
	  
	
       
}
 
public class move
{
 	   public static void main (String arr[])
	{

	A a=new A();
	B b=new B();
	A c=new A();
	//B d=new A();
	

	a.move();
	b.move();
	c.move();
	//d.move();

	}
}

	