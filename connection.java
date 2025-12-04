package connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
	public static final String url = "jdbc;mysql;//localhost;3306/virat";
	public static final String user = "root";
	public static final String pws = "laxyata@123";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
		}
		catch(Exception e) {
			System.out.println("Driver not loaded");
		}
		
	}
	 
	public static void main(String arg[]){
		     Connection con = null;
		try {
			 con = DriverManager.getConnection(url,user,pws);
			 Statement smt = con.createStatement();
			 int x = smt.executeUpdate("Create database lakshyata");
			  
		if (x>0) {
			System.out.println("database created successfully");
		}
		else {
			System.out.println("Database not created");
		}
		
		int i = smt.executeUpdate("Create Table family (Sno int(5) PRIMARY KEY, Name varchar(10), Status varchar(10));");
		   
		if (i>0){
			System.out.println("Table created successfully");
		}
		else{
			System.out.println("Table not created");
		}
		con.close();
					
	} 
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	
}
