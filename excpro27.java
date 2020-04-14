
class excpro27
{
   public static void main(String arr[])
   {
	try
	{
	  int i=5;
	  i=i/0;
	  System.out.println("I="+i);
	}
	
	catch(Exception e)
	{
	  System.out.println("CANNOT DIVIDE BY ZERO");
	}
   }
}
