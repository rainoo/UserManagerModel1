package com.gittoy.entity;

/**
 * 用户类
 * 
 * @author GaoYu
 */
public class User {

	// ID，数据库自增字段
	private int id;
	// 用户名
	private String username;
	// 密码
	private String password;
	// 姓名
	private String name;
	// 手机
	private String mobile;
	// 电子邮箱
	private String email;
	// 身份证号
	private String idcard;
	// 逻辑删除标识
	private String delflg;
	// 总行数
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getDelflg() {
		return delflg;
	}

	public void setDelflg(String delflg) {
		this.delflg = delflg;
	}
}
