package com.databases;

import redis.clients.jedis.Jedis;

public class Redis {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.31.202", 6379); 
		jedis.auth("haiyang");
		String time =String.valueOf(System.currentTimeMillis());
		println("time:"+time);
		//测试String
		//jedis.set("abc", time); 
		println("abc:"+jedis.get("abc"));
		//jedis.del("abc");

	}
	
	private static void println(String string){
		System.err.println(string);
	}
}
