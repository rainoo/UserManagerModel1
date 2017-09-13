package com.gittoy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gittoy.entity.User;
import com.gittoy.util.DBHelper;

/**
 * 用户的数据库访问
 * 
 * @author GaoYu
 */
public class UserDao {

	// 查询数据库USER表所有内容
	public ArrayList<User> getAllUsers() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<User> userList = new ArrayList<User>();
		try {
			conn = DBHelper.getConnection();
			String sql = "select ID, USERNAME, PASSWORD, NAME, MOBILE, EMAIL, IDCARD, DELFLG from dl_user where DELFLG != '1' limit 0, 20";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("ID"));
				user.setUsername(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setMobile(rs.getString("MOBILE"));
				user.setEmail(rs.getString("EMAIL"));
				user.setIdcard(rs.getString("IDCARD"));
				user.setDelflg(rs.getString("DELFLG"));
				// 把一个商品加入集合
				userList.add(user);
			}

			return userList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			// 释放数据集对象
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// 释放语句对象
			if (stmt != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 查询数据库USER表的行数
	public int getUsersCout() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int userCount = 0;
		try {
			conn = DBHelper.getConnection();
			String sql = "select count(1) as cnt from dl_user where DELFLG != '1'";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			rs.next();
			userCount = rs.getInt("cnt");

			return userCount;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			// 释放数据集对象
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// 释放语句对象
			if (stmt != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		UserDao ud = new UserDao();
		System.out.println(ud.getUsersCout());
	}
}
