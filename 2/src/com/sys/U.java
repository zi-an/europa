package com.sys;

import java.net.URL;

public class U {
public static void main(String[] args) throws Exception{
	 URL url = new URL("http://192.168.31.7/lol/");
     url.openConnection().getInputStream();
}
}
