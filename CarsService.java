package com.service;

import com.dao.CarsDao;

public class CarsService {
	public void insert() throws Exception {
		CarsDao cd=new CarsDao();
		cd.insertData();
	}
	public void update() throws Exception {
		CarsDao cd=new CarsDao();
		cd.update();
	}
	public void delete() throws Exception {
		CarsDao cd=new CarsDao();
		cd.delete();
	}
	public void fetch() throws Exception {
		CarsDao cd=new CarsDao();
		cd.getAllData();
	}

}
