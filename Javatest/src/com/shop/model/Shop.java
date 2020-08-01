package com.shop.model;

public class Shop { 
	private static  int count=12;
	 private int bookid;
	 private String bookname;
	 private String booktype;
	 private String author;
	 private double cost;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Shop.count = count++;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Shop [bookid=" + bookid + ", bookname=" + bookname + ", booktype=" + booktype + ", author=" + author
				+ ", cost=" + cost + "]";
	}

}
