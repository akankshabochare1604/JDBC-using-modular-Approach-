package com.service;

import com.dao.CarsPrepDao;

public class CarsPrepService {
	public void insert() throws Exception {
		CarsPrepDao cd=new CarsPrepDao();
		cd.insert();
	}
	public void update()throws Exception{
		CarsPrepDao cd=new CarsPrepDao();
		cd.update();
		
	}
	public void delete()throws Exception{
		CarsPrepDao cd=new CarsPrepDao();
		cd.delete();
	}
	public void fetch()throws Exception{
		CarsPrepDao cd=new CarsPrepDao();
		cd.fetch();
	}

}
