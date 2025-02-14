package com.controller;

import com.service.BooksPrepService;

public class BooksPrepController {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BooksPrepService bs=new BooksPrepService();
//		bs.insert();
//		bs.update();
//		bs.delete();
		bs.fetch();

	}

}
