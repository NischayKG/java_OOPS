import java.util.*;
import java.sql.*;
public class staffs2
{
  public static void main(String arr[])
  {
    try
    {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //loads the driver
	System.out.println("Driver Loaded");
	Connection c=DriverManager.getConnection("jdbc:odbc:NischayDS","sa","Abc123");
	//get connection details from ODBC Data Source
	String itemcode, itemname;
	int rate, qty, amt;

	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter Item Code: ");
	itemcode=s.next();

	System.out.println("Enter item name ");
	itemname=s.next();
	
	System.out.println("Enter rate");
	rate=s.nextInt();
	
	System.out.println("enter quantity");
	qty=s.nextInt();
        
	amt=rate*qty;
	
		
	PreparedStatement pStat=c.prepareStatement("insert into Items values(?,?,?,?,?)");
	
	pStat.setString(1,itemcode);
	pStat.setString(2,itemname);
	pStat.setInt(3,rate);
	pStat.setInt(4,qty);
	pStat.setInt(5,amt);

	int i = pStat.executeUpdate();
	if(i>0)
	{
	   System.out.println("DATA UPDATES");
	}
	else
	{
	   System.out.println("ERROR WHILE INSERTING DATA");
	}

    }
    catch(Exception e)
    {
	   System.out.println(e);
    }
  }   
}



	
	
	
	