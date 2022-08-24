package com.test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Random;

public class MD5Thread extends Thread {
	private static Random random = new Random();

	public void run() {
		try {
			for (;;) {
				getMD5(String.valueOf(random.nextInt()));
				// System.out.println(Thread.currentThread().getName()+":"+getMD5(String.valueOf(random.nextInt())));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getMD5(String input) throws Exception {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(input.getBytes());
		byte[] byteArray = md5.digest();
		BigInteger bigInt = new BigInteger(1, byteArray);
		String result = bigInt.toString(16);
		while (result.length() < 32) {
			result = "0" + result;
		}
		return result;
	}
}
