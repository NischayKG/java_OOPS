import java.util.*;
class student
{
	public void print()  
	{
	System.out.println(" Student class");
	}
}
	
class year1 extends student
{
	public void print()
	{
	System.out.println("1st year student");
	}
}

class year2 extends student
{
	public void print()
	{
	System.out.println("2nd year student");
	}
}

class year3 extends student
{
	public void print()
	{
	System.out.println("3rd year student");
	}
}
	
class year4 extends student
{
	public void print()
	{
	System.out.println("4th year student");
	}
}

public class instanceofpro18
{
	public void disp(student s)
	{
	if(s instanceof year1)
		{
		s.print();
		}
	
	if(s instanceof year2)
		{
		s.print();
		}
	
	if(s instanceof year3)
		{
		s.print();
		}
	
	if(s instanceof year4)
		{
		s.print();
		}
	}
	public static void main(String arr[])
	{
	year1 y1=new year1(); 
	year2 y2=new year2();
	year3 y3=new year3();
	year4 y4=new year4();
	extendspro18 obj=new extendspro18();
        int n;
        System.out.println("Enter the student's year you want to access");	
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
		if(n==1)
		{
		obj.disp(y1);	
		}
		else if(n==2)
		{
		obj.disp(y2);	
		}
		else if(n==3)
		{
		obj.disp(y3);	
		}
		else if(n==4)
		{
		obj.disp(y4);	
		}
		else
		{
		System.out.println("Please enter a valid year");
		}
	}
}