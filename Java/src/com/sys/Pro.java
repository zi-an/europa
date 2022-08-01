package com.sys;

import java.util.Properties;

public class Pro {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		properties.keySet();
		for (Object object: properties.keySet()) {
		System.out.println(object.toString()+":"+properties.getProperty(object.toString()));
		}
	}
}
