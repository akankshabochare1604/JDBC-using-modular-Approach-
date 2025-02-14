package com.controller;

import com.service.CarsPrepService;

public class CarsPrepControl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CarsPrepService cs=new CarsPrepService();
//		cs.insert();
//		cs.update();
//		cs.delete();
		cs.fetch();

	}

}
