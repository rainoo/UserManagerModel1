package com.gittoy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	// 数据库驱动
	private static final String driver = "com.mysql.jdbc.Driver";

	// 连接数据库的URL地址
	private static final String url = "jdbc:mysql://localhost:3306/dl?useUnicode=true&characterEncoding=UTF8";

	// 数据库的用户名
	private static final String username = "root";

	// 数据库的密码
	private static final String password = "123456";

	// 数据库连接对象
	private static Connection conn = null;

	// 静态代码块加载驱动
	static {
		try {
			Class.forName(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// 单例模式返回数据库连接对象
	public static Connection getConnection() throws SQLException {
		return conn == null ? DriverManager.getConnection(url, username, password) : conn;
	}

	// 数据库连接测试
	// public static void main(String[] args) {
	// try {
	// Connection conn = DBHelper.getConnection();
	// if (conn != null) {
	// System.out.println("数据库连接正常！");
	// } else {
	// System.out.println("数据库连接异常");
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// }
}
