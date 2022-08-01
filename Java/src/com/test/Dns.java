package com.test;

import java.net.Inet4Address;
import java.net.InetAddress;

public class Dns {
public static void main(String[] args) throws Exception{
	for(int i=100;i<999;i++){
		String string="vdo.clf"+String.valueOf(i)+".com";
		try {
			InetAddress inetAddress =Inet4Address.getByName(string);
			System.out.println(string +"="+inetAddress.getHostAddress());
		} catch (Exception e) {
			
		}
		
	}
}
}


//https://clf983.com/m3u8/20201206/1_ZraXzceygX_0/1_ZraXzceygX_0.m3u8