import java.io.*;
import java.util.*;
class wtproject2
{
	public static void main(String args[])
	{
	 char ch[][]=new char[50][6];
	char s='0';
	
	int rlen=0;
	System.out.println("Enter the sentence word by word, input * in  the place of white spaces and input # where you want to end\n");
                      Scanner obj=new Scanner(System.in);
	for(int i=0;i<50;i++,rlen++)
	{
		for(int j=0;j<6;j++)
		{	s=obj.next().charAt(0);
			if(s!='#')
			ch[i][j]=s;
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
		if(s=='#')
		break;
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



	System.out.println("The output sentence you want is-----"+"\n\n");
	for(int j=0;j<6;j++)
	{
		for(int i=0;i<=rlen;i++)
		{
		     System.out.print(ch[i][j]+" ");
		}
		
	}


    }

}



	