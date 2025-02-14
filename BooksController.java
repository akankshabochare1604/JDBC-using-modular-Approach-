package com.controller;

import com.service.BooksService;

public class BooksController {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BooksService bs=new BooksService();
//		bs.insert();
//		bs.update();
//		bs.delete();
		bs.fetch();

	}

}
