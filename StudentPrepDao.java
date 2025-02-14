package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentPrepDao {
	public void insert() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps=c.prepareStatement("insert into Students values(?,?,?)");
		ps.setInt(1,6);
		ps.setString(2,"Sunil");
		ps.setString(3, "Pune");
		ps.executeUpdate();
		System.out.println("data inserted..");
		c.close();
		}
	public void delete() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps=c.prepareStatement("delete from Students where id=? ");
		ps.setInt(1,2);
		ps.executeUpdate();
		System.out.println("data deleted..");
		c.close();
	}
	public void update() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps=c.prepareStatement("update students set name=? where id=?");
		ps.setInt(2,6);
		ps.setString(1, "Om");
		ps.executeUpdate();
		System.out.println("data updated..");
		c.close();
	}
	public void fetch() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps=c.prepareStatement("select *from students");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		c.close();
	}
	


}
