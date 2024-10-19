package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase
{
	public static void main(String[] args)
	{
		String connectionString = "jdbc:sqlserver://DESKTOP-KJC6B92\\SQLEXPRESS;databaseName=AdventureWorksLT2019;encrypt=true;TrustServerCertificate=true;";
		String userID = "aditya";
		String pass = "Aditya@8919";
		String sqlQuery = "SELECT TOP 3 * FROM SalesLT.Address";
		
		try
		{
			Connection conn = DriverManager.getConnection(connectionString, userID, pass);
			System.out.println("Database connected");
			
			Statement statement = conn.createStatement(); //Creates a Statement object
			ResultSet data = statement.executeQuery(sqlQuery);  // to execute the sql query on DB
			
			if(data != null)
			{
				System.out.println("Data Fetched");
				while(data.next()) 
				{
					System.out.println(data.getString("AddressID"));
				}
			}
			else
			{
				System.out.println("Data not Fetched");
			}
		} 
		catch (Exception e)
		{
			System.out.println("Exception found : " + e.getMessage());
		}
		
		
	}
	
	

}
