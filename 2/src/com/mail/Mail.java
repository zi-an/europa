package com.mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	public static void main(String[] args) {
		// 收件人电子邮箱
		String to = "haiyang@mail.zi-an.ml";

		// 发件人电子邮箱
		String from = "root@mail.zi-an.ml";

		// 指定发送邮件的主机为 localhost
		String host = "192.168.31.205";

		// 获取系统属性
		Properties properties = System.getProperties();

		// 设置邮件服务器
		properties.setProperty("mail.smtp.host", host);
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.setProperty("mail.smtp.auth", "true");
		//properties.setProperty("mail.user", "haiyang");

		// 获取默认session对象
		//Session session = Session.getDefaultInstance(properties);
		//session.setPasswordAuthentication(new URLName("smtp", host, -1, null,
		//		"haiyang", null), new PasswordAuthentication("haiyang",
		//		"111111"));
		
		Session session=Session.getDefaultInstance(properties, new Authenticator(){
			   public PasswordAuthentication getPasswordAuthentication(){
			    return new PasswordAuthentication("root","1"); 
			   }
			  });
		
		try {
			// 创建默认的 MimeMessage 对象
			MimeMessage message = new MimeMessage(session);

			// Set From: 头部头字段
			message.setFrom(new InternetAddress(from));

			// Set To: 头部头字段
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					to));

			// Set Subject: 头部头字段
			message.setSubject("932！");

			// 设置消息体
			message.setText("I'm the root!");

			// 发送消息
			session.getTransport().connect("haiyang", "1");
			;

			Transport.send(message);

			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
