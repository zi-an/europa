package com.net;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class Proxy {
public static void main(String[] args) throws Exception{

	System.setProperty("http.proxyHost", "206.zi-an.ml");
	System.setProperty("http.proxyPort", "3128");
	System.setProperty("http.proxyUser","haiyang");
	System.getProperty("http.proxyPassword","haiyang");
	System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "");
    Authenticator.setDefault(
            new Authenticator() {
                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("haiyang", "haiyang".toCharArray());
                }
            }
    );
	URL url=new URL("http://192.168.31.7:8080/");
	//System.out.println(IOUtils.toString(url.openConnection().getInputStream()));
	IOUtils.toString(url.openConnection().getInputStream());
	
}
}

//java -Dhttp.proxyHost=127.0.0.1 -Dhttp.proxyPort=3020 
//com.zditect.networking.proxies.CommandLineProxyDemo
