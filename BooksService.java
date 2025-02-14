package com.service;

import com.dao.BooksDao;

public class BooksService {
	public void insert() throws Exception {
		BooksDao bd=new BooksDao();
		bd.insertData();
	}
	public void update()throws Exception{
		BooksDao bd=new BooksDao();
		bd.updateData();
	}
	public void delete()throws Exception{
		BooksDao bd=new BooksDao();
		bd.deleteData();
	}
	public void fetch()throws Exception{
		BooksDao bd=new BooksDao();
		bd.getAllData();
	}
}
