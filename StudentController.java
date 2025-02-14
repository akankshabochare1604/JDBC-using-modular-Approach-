package com.controller;

import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StudentService s=new StudentService();
//		s.insertData();
//		s.updateData();
//		s.deleteData();
		s.getallData();
	}

}
