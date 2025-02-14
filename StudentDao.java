package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into students values(8,'Kirti','Pune')");
		System.out.println("Data inserted succesfully");
		c.close();

	}

	public void updateData() throws Exception {
		// load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// get connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		// statement
		Statement s = c.createStatement();
		s.executeUpdate("update students set name='Sandip' where id=1");
		System.out.println("data updatedc successfully!");
		c.close();

	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from students where id=2");
		System.out.println("Data deleted successfully!!");
		c.close();
	}

	public void getallData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select *from students");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		c.close();
	}

}
