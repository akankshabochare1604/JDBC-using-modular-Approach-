package com.controller;

import com.service.CarsService;

public class CarsController {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CarsService cs=new CarsService();
//		cs.insert();
//		cs.update();
//		cs.delete();
		cs.fetch();

	}

}
