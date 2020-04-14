class A
{
	A()
	{
		System.out.println("class A constructor called");
        }
}

class B extends A
{
	B()
	{
		System.out.println("class B constructor called");
        }
}

class C extends B
{
	C()
	{
		System.out.println("class C constructor called");
        }
}

 class consttest
{
 public static void main(String arr[])
  {
     C c=new C();
  }
}
