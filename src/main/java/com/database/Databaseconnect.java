/**
 * 
 */
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nbusireddy
 *Host :sql6.freesqldatabase.com
 *Port:3306
 *database:sql6490066
 *username:sql6490066
 *password:	gg8ywQgqVu
 */
public class Databaseconnect {
	
	static String usernames;
	static String passwords;
	static String host="jdbc:mysql://sql6.freesqldatabase.com:3306/sql6490066";
	static String username="sql6490066";
	static String password="gg8ywQgqVu";
	static String driver ="com.mysql.cj.jdbc.Driver";
	static int rowcount=0;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		testmain();
	}

	public static Object[][]  testmain() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		
		Class.forName(driver).newInstance();

		//connection to DB
		Connection connection =	DriverManager.getConnection(host, username, password);
		if(!connection.isClosed()) {
			System.out.println("Database connected");
		}

		//ruuning query
		Statement statment = connection.createStatement();
		Statement statment2 = connection.createStatement();
		ResultSet rs =statment.executeQuery("select * from login");
		ResultSet rs2 =statment2.executeQuery("select count(*) from login");
		int columncount = rs.getMetaData().getColumnCount();		
		System.out.println(columncount);
		
		while(rs2.next()) {
			rowcount = rs2.getInt(1);
			System.out.println("rows count-->"+rowcount);
		}
		
		//List<String[]> table = new ArrayList<String[]>();
		Object[][] data = new Object[rowcount][columncount];
		int i=0;
		//iterating the records from DB
		while(rs.next()) {
			
			
						for(int j=1;j<=columncount;j++) {
				System.out.println(rs.getString(j));
						}
						
						i++;
			}
		
		return data;
			
			 
		}
		    
		
		
		}



