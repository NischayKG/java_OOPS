import java.util.*;
public class assignmentwt
{
   public static void main(String arr[])
    {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of characters you want to print");
	int n=s.nextInt();
/*			System.out.println("Enter the  characters you want to print");
			for(int i=0;i<n;i++)
			{
			Scanner ss=new Scanner(System.in);
			char ch=ss.next().charAt(i);
			}
*/
 	System.out.println(" \n\nCharacters you entered were----");
	for(int i=0;i<n;i++)
	{
		 Scanner ss=new Scanner(System.in);
		char ch=ss.next().charAt(i);
		System.out.println(ch);
	}






	
   }
}