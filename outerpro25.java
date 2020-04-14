public class outerpro25
{
	int i=10;
	
     
		public class inner
		{
		   int j=20;
		   public void innerfn()
			{  System.out.println("Welcome to inner class");
		   	System.out.println("I="+i);
		   	System.out.println("J="+j);
			 System.out.println(" Inner class function ends here ");
			} 
      		} 
  
         public void outerfn()
   	{
    	   inner in=new inner();
    	   in.innerfn();
	   
	   System.out.println("\n\n");
           
   	}
   	public void outerdisp()
   	{  System.out.println("Welcome to outer class");
   	   System.out.println("I is="+i);
	   
   	}

	public static void main(String arr[])
	{
	outerpro25 obj1=new outerpro25();
	obj1.outerfn();
	obj1.outerdisp();
	}
}




     
