package com.test;


public class MD5 {

	public static void main(String[] args) throws Exception {
		for (int i=0;i<=63;i++) {
			Thread thread=new MD5Thread();
			thread.start();
		}
	}

	
}
