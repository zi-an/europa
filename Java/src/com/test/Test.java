package com.test;

import java.util.Random;

public class Test {
	

	public static void main(String[] args) throws Exception {
		for (;;) {
			Demo.print();
			Thread.sleep(3000);
		}
	}
}


class Demo{
	private static Random random = new Random();
	static void print(){
		System.out.println(random.nextInt());
	}
}