package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BooksDao {
	public void insertData() throws Exception {
		// register and load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// get connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");

		// use statement
		Statement s = c.createStatement();
		s.executeUpdate("insert into books values(1,'Miracle Morning',200) ");
		s.executeUpdate("insert into books values(2,'Ikigai',260) ");
		s.executeUpdate("insert into books values(3,'Power of SubCOnscious Mind',300) ");
		s.executeUpdate("insert into books values(4,'Surrounded  by Idiots',350) ");
		s.executeUpdate("insert into books values(5,'Rich dad and Poor Dad',300) ");
		System.out.println("Your data is inserted successfully!");
		c.close();

	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update books set price=220 where id=1");
		System.out.println("Data updated successfully!");
		c.close();

	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from books where id=5");
		System.out.println("Data deleted!");
		c.close();

	}

	public void getAllData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select* from books");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
	}


}
