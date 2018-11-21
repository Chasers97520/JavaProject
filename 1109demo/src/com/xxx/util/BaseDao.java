package com.xxx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		
		String url="jdbc:mysql://127.0.0.1:3306/form?useUnicode=true&characterEncoding=UTF-8";
		String username="root";
		String passeord="19970520";
		try {
			Connection conn=DriverManager.getConnection(url,username,passeord);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
