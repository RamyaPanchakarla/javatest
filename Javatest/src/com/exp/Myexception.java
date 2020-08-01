package com.exp;

public class Myexception extends Exception {
	String msg;
	public Myexception(String msg) {
		
		
			this.msg=msg;
		}
		@Override
		public String getMessage() {
			
			return msg;
		}
		

	}

	


