import java.util.*;
import java.sql.*;
public class sql2
{
   public static void main(String arr[])   
   {
     try
     {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("Driver Loaded");
        Connection c=DriverManager.getConnection("jdbc:odbc:NischayDS","sa","Abc123");
	System.out.println("Connection Established");
	String code,name;
	int amount;
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter Itemcode :");
	code=s.next();
	System.out.println("Enter itemname :");
	name=s.next();
	System.out.println("enter amount :");
	amount=s.nextInt();
		
	PreparedStatement pStat=c.prepareStatement("insert into things values(?,?,?)");
	pStat.setString(1,code);
	pStat.setString(2,name);
	pStat.setInt(3,amount);
	
	int i=pStat.executeUpdate();
	
	if(i>0)
	{
	System.out.println("Data Updated");
	}
	else
	{
	System.out.println("ERROR IS THERE");
	}

     }
     
     catch(Exception e1)
     {
	System.out.println(e1.toString());
     }
     
   }
}