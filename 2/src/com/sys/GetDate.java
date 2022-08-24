package com.sys;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetDate {
public static void main(String[] args) {
	SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
	Calendar calendar=Calendar.getInstance();
	calendar.add(Calendar.DATE, -1); 
	System.out.println(simpleDateFormat.format(calendar.getTime()));
}
}
