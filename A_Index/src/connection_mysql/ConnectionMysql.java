package connection_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionMysql
{
	private static Connection cn;
	private static Statement stm;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="Raut@123";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/stu";
	
	
	public static Connection getConnetion() {
		try {
			
			Class.forName(DB_DRIVER_CLASS);// to load database driver
			System.out.println("Driver loaded successfully....");


			cn= DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection established successfully....");	
			
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("class Error....." + e.getMessage());
			// e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			System.out.println(" mysql Error....." + e.getMessage());
		}
		return cn;
		
	}
   
	public static void getInsert() 
	{
		try 
		{
			
			cn = getConnetion();
			
			stm = cn.createStatement();
			
			String iquery = "insert into stu_info values (005,'Kaustubh','A','Civil')";
			
		
			stm.executeUpdate(iquery);
			
			System.out.println("Data Inserted!!!");
			
		}
		catch(Exception e) 
		{
			
		}
	}
	
	public static void getDelete() 
	{
		try 
		{
			
			cn = getConnetion();
			
			stm = cn.createStatement();
			
			String iquery = "delete from stu_info where stu_id=005";
			
		
			stm.executeUpdate(iquery);
			
			System.out.println("Data Deleted!!!");
			
		}
		catch(Exception e) 
		{
			
		}
	}

	public static void getUpdate() 
	{
		try 
		{
			
			cn = getConnetion();
			
			stm = cn.createStatement();
			
			String iquery = "update stu_info set stu_name='Ram' where stu_id==004";
			
		
			stm.executeUpdate(iquery);
			
			System.out.println("Data Updated!!!");
			
		}
		catch(Exception e) 
		{
			
		}
	}

	
	public static void fetchRecords() {
		try 
		{
			ResultSet rs;
			cn = getConnetion();
		
			stm = cn.createStatement();
		
			String iquery = "select * from stu_info";
			
	
			rs = stm.executeQuery(iquery)  ;
		
		
			while (rs.next())
			{
				System.out.println( "stu_id" + rs.getString(1) + "stu_name" + rs.getString(2) + "stu_grade" + rs.getString(3));
			}
		}
		catch(Exception e) 
		{
			
		}
	}
	
	@SuppressWarnings("resource")
	public static void fetchAll() {
		try 
		{
			ResultSet rs;
			cn = getConnetion();
		
			stm = cn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Branch");
			
			String s = sc.nextLine();
		
			String iquery = "select stu_id, stu_name, stu_grade, stu_branch from stu_info where stu_branch='" + s + "'";
			
	
			rs = stm.executeQuery(iquery)  ;
		
		
			while (rs.next())
			{
				System.out.println( "stu_id" + rs.getString(1) + "stu_name" + rs.getString(2) + "stu_grade" + rs.getString(3) + "stu_branch" + rs.getString(4));
			}
		}
		catch(Exception e) 
		{
			
		}
	}	
	
}
