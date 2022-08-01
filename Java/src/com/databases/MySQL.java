package com.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
	// jdbc:mysql://localhost:3306/tt?useSSL=false&serverTimezone=UTC";
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager
				.getConnection(
						"jdbc:mysql://192.168.31.201:3306/ry?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC",
						"haiyang", "haiyang");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("select * from sys_user ");

		while (resultSet.next()) {
			System.out.println(resultSet.getString(1));
			System.out.print(resultSet.getString(2));
			System.out.print(resultSet.getString(3));
			System.out.print(resultSet.getString(4));

		}
		System.out.println("海水水水水水水水水水水水水水");

	}
}
