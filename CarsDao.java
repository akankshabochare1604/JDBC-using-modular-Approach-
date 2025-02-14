package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CarsDao {
	public void insertData() throws Exception {
		//register and load Driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				//get connection
				
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
				//4.use statements
				Statement s= c.createStatement();
				//5.insert data
				s.executeUpdate("insert into cars values(1,'Toyota','White')");
				s.executeUpdate("insert into cars values(2,'Honda','Black')");
				s.executeUpdate("insert into cars values(3,'Tata','Purple')");
				s.executeUpdate("insert into cars values(4,'Mahindra','Black')");
				s.executeUpdate("insert into cars values(5,'suzuki','silver')");
				 System.out.println("data inserted successfully");
				 c.close();

	}
	public void update()throws Exception {
		//register and load Driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				//get connection
				
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
				//4.use statements
				Statement s= c.createStatement();
				//5.update data
				s.executeUpdate("update cars set color='black' where id=1");
				
				 System.out.println("data updated successfully");
				 c.close();

	}
public void delete() throws Exception{
	//register and load Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
			//4.use statements
			Statement s= c.createStatement();
			//5.delete data
			s.executeUpdate("delete from cars where id=2");
			
			 c.close();

}
public void getAllData() throws Exception {
	//register and load Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
			//4.use statements
			Statement s= c.createStatement();
			ResultSet rs=s.executeQuery("select *from cars");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			 c.close();

}
}
