package com.haiyang;

import java.util.Locale;

public class Language {
public static void main(String args[]){
	 Locale locale =Locale.getDefault(); 
	 System.out.println(locale.getCountry());
	 System.out.println(locale.getLanguage());
}
}
