import java.util.*;
class a
{  int num[];
    public void get()
    {  int n;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the size of the array");
	n=s.nextInt();
      num=new int[n];  
     System.out.println("now Enter ths elements of the array");
      for(int i=0;i<n;i++)
        num[i]=s.nextInt();
     }    
     public void disp()
     { int p;
       System.out.println("\n enter the index number u want to access\n");
	Scanner s=new Scanner(System.in);
        p=s.nextInt();
       if(p<5)
         System.out.println(num[p]+"\t");
       else
         throw new ArrayIndexOutOfBoundsException(p);
     }
      
}

public class pro36
{
    public static void main(String arrt[])
    {
      a obj=new a();
      try
      {	obj.get();
        obj.disp();
      }
      catch(ArrayIndexOutOfBoundsException p)
      {
         System.out.println("enter a index number properly");
      }
     }
}