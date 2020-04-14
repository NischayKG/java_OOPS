import java.io.*;
import java.util.*;
class chararr
{
	public static void main(String args[])
	{
	char ch[]=new char[50];
	char s;int l=0;
	System.out.println("Enter Name and input * at the end\t:\t");
	Scanner obj=new Scanner(System.in);
	for(int i=0;i<50;i++;l++)
	{
		s=obj.next().charAt(0);
	if(s!='*')
		ch[i]=s;
	else
		break;
	}	
	
	for(int i=0;i<l;i++)
	{
		System.out.print(ch[i]+"\t");
	}
}