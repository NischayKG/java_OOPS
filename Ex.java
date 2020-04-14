class Ex
{
	int x;
	int y;
	void m1(Ex e)
	{
		x=x+1;
		y=y+2;
		e.x=e.x+3;
		e.y=e.y+4;
	}
	public static void main(String[] args)
	{
		Ex e1=new Ex();
		Ex e2=new Ex();
		e1.m1(e1);
		System.out.println(e1.x+"......"+e1.y);
		System.out.println(e2.x+"......"+e2.y);
		e2.m1(e2);
		System.out.println(e1.x+"......"+e1.y);
		System.out.println(e1.x+"......"+e1.y);
		e1.m1(e2);
		System.out.println(e1.x+"......"+e1.y);
		System.out.println(e1.x+"......"+e1.y);
		e2.m1(e1);
		System.out.println(e1.x+"......"+e1.y);
		System.out.println(e2.x+"......"+e2.y);
	}
	
	
}