 import java.io.*;
import java.util.*;
class wttest
{
	public static void main(String args[])
	{
	 char ch[][]=new char[50][6];
	char s='0';
	
	int rlen=0;
	System.out.println("Enter the sentence");
	Scanner obj=new Scanner(System.in);
	String str=obj.nextLine();
	char x[]=str.toCharArray();
	System.out.println("The character array now is--: ");
	for(int i=0;i<x.length;i++)
	{
	System.out.print(x[i]);
	}


	System.out.println("\n");
	int a=0;	
	for(int i=0;i<50&&a<(x.length);i++,a++,rlen++)
	{
		for(int j=0;j<6;j++,a++)
		{	s=x[a];
			

			if(s!='.'&&s!=' ')
			ch[i][j]=s;
			else if(s==' ')
			ch[i][j]='*';
			 
			else
			{ 
			   while(j<6)
			   {
			     ch[i][j]='.';
			      j++;
			    }
			break;
			}
		}
		if(s=='.')
		break;
 	                    a--;
	}
	

	System.out.println("The sentence you entered is-----"+"\n\n");
	for(int i=0;i<=rlen;i++)
	{
		for(int j=0;j<6;j++)
		{
		     System.out.print(ch[i][j]+" ");
		}
		System.out.println("\n");
	}


	char res[]=new char[50];
	int d=0;
	System.out.println("The output sentence you want is-----"+"\n\n");
	for(int j=0;j<6;j++)
	{
		for(int i=0;i<=rlen;i++)
		{
		res[d]=ch[i][j];
		d++;
		 }
		
	}

	String ss=new String(res);
	
	 System.out.println(ss);


    }

}



	