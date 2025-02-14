package com.service;

import com.dao.BooksPrepDao;

public class BooksPrepService {
	public void insert() throws Exception {
		BooksPrepDao bd = new BooksPrepDao();
		bd.insert();
	}
	public void update()throws Exception{
		BooksPrepDao bd=new BooksPrepDao();
		bd.update();
	}
	public void delete()throws Exception{
		BooksPrepDao bd=new BooksPrepDao();
		bd.delete();
	}
	public void fetch()throws Exception{
		BooksPrepDao bd=new BooksPrepDao();
		bd.fetch();
	}
}
