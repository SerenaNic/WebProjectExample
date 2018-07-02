package it.unirc.campo_coni.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {



	public static Connection startConnection(Connection conn)
	{
		@SuppressWarnings("unused")
		String DbDriver=null;
		String DbURL=null;
		String username=null;
		String password=null;
		String schema=null;


		schema="DIGITALBE_APP";
		DbDriver = "oracle.jdbc.driver.OracleDriver";
		DbURL = "jdbc:oracle:thin:@sdbmignttest-scan.sisal.it:1521/dpaybes.sisal.it"; 
		//DbURL = "jdbc:mysql://localhost/"+schema+"?socketFactory=SSHSocketFactory&SSHHost=192.168.3.42&SSHUser=nino&SSHPassword=nocera369";
		//System.out.println(DbURL);
		
		username = "digitalbe_APP";
		password = "digitalbe_app";

		if ( isOpen(conn) ){

			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn=null;
		}
		try 
		{

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(DbURL, username, password);// Apertura connessione

		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return conn;
	}

	public static boolean isOpen(Connection conn)
	{
		if (conn == null)
			return false;
		else
			return true;
	}

	public static Connection closeConnection(Connection conn)
	{
		if ( !isOpen(conn) )
			return null;
		try 
		{

			conn.close();
			conn = null;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return null;
		}
		return conn;
	}
}
