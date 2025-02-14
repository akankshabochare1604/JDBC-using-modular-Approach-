package com.controller;

import com.dao.StudentPrepService;

public class StudentPrepControl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StudentPrepService s=new StudentPrepService();
//		s.insert();
//		s.update();
//		s.delete();
		s.fetch();

	}

}
