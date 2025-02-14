package com.service;

import com.dao.StudentPrepDao;

public class StudentPrepService {
	public void insert()throws Exception{
		StudentPrepDao sd=new StudentPrepDao();
		sd.insert();
	}
	public void update()throws Exception{
		StudentPrepDao sd=new StudentPrepDao();
		sd.update();
	}
	public void delete()throws Exception{
		StudentPrepDao sd=new StudentPrepDao();
		sd.delete();
	}
	public void fetch()throws Exception{
		StudentPrepDao sd=new StudentPrepDao();
		sd.fetch();
	}
}
