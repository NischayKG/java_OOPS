import java.util.*;
import java.sql.*;
public class sql1
{
   public static void main(String arr[])   
   {
     try
     {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("Driver Loaded");
        Connection c=DriverManager.getConnection("jdbc:odbc:NischayDS","sa","Abc123");
	System.out.println("Connection Established");
	String Itemcode,Itemname;
	int Rate,Qty,Amt,discval,payableamt;
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter Itemcode :");
	Itemcode=s.next();
	System.out.println("Enter itemname :");
	Itemname=s.next();
	System.out.println("enter Rate :");
	Rate=s.nextInt();
	System.out.println("enter Quantity :");
	Qty=s.nextInt();
	Amt=Rate*Qty;
	System.out.println("Enter discount value :");
	discval=s.nextInt();
	payableamt=Amt-discval;
	
	PreparedStatement pStat=c.prepareStatement("insert into Items values(?,?,?,?,?,?,?)");
	pStat.setString(1,Itemcode);
	pStat.setString(2,Itemname);
	pStat.setInt(3,Rate);
	pStat.setInt(4,Qty);
	pStat.setInt(5,Amt);
	pStat.setInt(6,discval);
	pStat.setInt(7,payableamt);
	
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