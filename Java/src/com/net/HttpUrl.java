package com.net;

import java.net.URL;

import org.apache.commons.io.IOUtils;
 

public class HttpUrl {
public static void main(String[] args) throws Exception{
	URL url=new URL("https://www.baidu.com");
	String string=IOUtils.toString(url.openStream());
	System.out.println(string);
}
}
