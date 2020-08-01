package com.shop.main;

import java.util.*;

import com.exp.Myexception;
import com.product.model.Product;
import com.shop.iin.Shopinterface;
import com.shop.imple.Shopimplement;
import com.shop.model.Shop;
import com.test.uti.Utilities;

public class Shopdetails {
	public static void main(String[]args) {
		List<Shop> book=new ArrayList<Shop>();
		Shopinterface shopping=new Shopimplement();
	
		Scanner scr=new Scanner(System.in);
		while(true) {
		System.out.println("enter the no.of book");
		int num=scr.nextInt();
		System.out.println("press 1 to add book"+"\n press to display the book"+"\n press 3 to search the book"+"\n press 4  to update the book"+"\n press 5 to exit");
	
		int option=scr.nextInt();
		
		switch(option) {
		case 1:
			for(int i=0;i<num;i++) {
			System.out.println("enter the bookid");
			String bookid=scr.next();
			int bookid1=Integer.parseInt(bookid);
			String bookname=null;
			while(true) {
			System.out.println("enter the bookname");
		       String bookname2=scr.next();
		       try {
		    	   Utilities.Validatebookname(bookname2);
		    	   break;
		       }
		       catch e
		       
		       
		       System.out.println("enter the booktype");
		       String booktype2=scr.next();
		       System.out.println("enter the author");
		       String author2=scr.next();
		       System.out.println("enter the cost");
		       double cost2=scr.nextDouble();
		       
		     Shop sh=shopping.addbooks(bookid1, bookname2,booktype2,author2,cost2);
		           book.add(sh);
			}
			break;
		case 2:
		
			for (Shop p : book) {
				System.out.println(book);
			
			}
			break;
		case 3:            
	
	
		}
}
