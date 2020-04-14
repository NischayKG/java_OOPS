import java.util.*;
class a
{   
    int num[]={1,2,3,4,5};     
     public void disp()
     { 
       System.out.println("\n enter the index number u want to access\n");
	Scanner s=new Scanner(System.in);
       int p=s.nextInt();
       if(p<5)
         System.out.println(num[p]+"\t");
       else
         throw new ArrayIndexOutOfBoundsException(p);
     }
      
}

public class excpro34
{
    public static void main(String arrt[])
    {
      a obj=new a();
      try
      {	
        obj.disp();
      }
      catch(ArrayIndexOutOfBoundsException p)
      {
         System.out.println("enter a index number properly");
      }
     }
}