package com.test.uti;

import com.exp.Myexception;

public class Utilities {
		
public static void Validatebookname(String bookname) throws Myexception{
				if(!bookname.matches("[A-Za-z]+"))
					throw new Myexception("author  only in alphabates ");
}
public static void Validatetype(String booktype ) throws Myexception{
	if(!booktype.matches("[A-Za-z]+"))
		throw new Myexception("booktype  only in alphabates ");
}
public static void Validateauthor(String author) throws Myexception{
	if(!author.matches("[A-Za-z]+"))
		throw new Myexception("author  only in alphabates ");
}

}


