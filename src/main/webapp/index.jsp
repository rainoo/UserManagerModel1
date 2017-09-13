<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ page import="com.gittoy.entity.User" %>
<%@ page import="com.gittoy.dao.UserDao" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="X-UA-Compatible"content="IE=9; IE=8; IE=7; IE=EDGE" />
		<title>用户管理列表页面</title>
		<link href="css/all.css" rel="stylesheet" type="text/css" />
	</head>

	<body style="background: #e1e9eb;">
		<form action="" id="mainForm" method="post">
			<div class="right">
				<div class="current">当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">用户管理</a> &gt; 用户列表</div>
				<div class="rightCont">
					<p class="g_title fix">内容列表 <a class="btn03" href="#">新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn03" href="#">删 除</a></p>
					<table class="tab1">
						<tbody>
							<tr>
								<td width="90" align="right">姓名：</td>
								<td>
									<input type="text" class="allInput" value=""/>
								</td>
								<td width="90" align="right">手机：</td>
								<td>
									<input type="text" class="allInput" value=""/>
								</td>
	                            <td width="85" align="right"><input type="submit" class="tabSub" value="查 询" /></td>
	       					</tr>
						</tbody>
					</table>
					<div class="zixun fix">
						<table class="tab2" width="100%">
							<tbody>
								<tr>
								    <th><input type="checkbox" id="all" onclick="#"/></th>
								    <th>序号</th>
								    <th>用户名</th>
								    <th>密码</th>
									<th>姓名</th>
								    <th>手机</th>
									<th>电子邮箱</th>
								    <th>身份证号</th>
								    <th>操作</th>
								</tr>
								<%-- 用户循环开始 --%>
								<%
									UserDao userDao = new UserDao();
									int userCount = userDao.getUsersCout();
									ArrayList<User> userList = userDao.getAllUsers();
									for(int i = 0; i < userList.size(); i++) {
										User user = userList.get(i);
										if (i%2 == 0) {
								%>
								<tr>
								<%
									} else {
								%>
								<tr style="background-color:#ECF6EE;">
								<%
									}
								%>
									<td><input type="checkbox" /></td>
									<td><%=i+1 %></td>
									<td><%=user.getUsername() %></td>
									<td><%=user.getPassword() %></td>
									<td><%=user.getName() %></td>
									<td><%=user.getMobile() %></td>
									<td><%=user.getEmail() %></td>
									<td><%=user.getIdcard() %></td>
									<td>
										<a href="#">修改</a>&nbsp;&nbsp;&nbsp;
										<a href="#">删除</a>
									</td>
								</tr>
								<%-- 用户循环结束 --%>
								<%
									}
								%>
							</tbody>
						</table>
						<div class='page fix'>
							共 <b><%=userCount %></b> 条
							<a href='###' class='first'>首页</a>
							<a href='###' class='pre'>上一页</a>
							当前第<span>1/1</span>页
							<a href='###' class='next'>下一页</a>
							<a href='###' class='last'>末页</a>
							跳至&nbsp;<input type='text' value='1' class='allInput w28' />&nbsp;页&nbsp;
							<a href='###' class='go'>GO</a>
						</div>
					</div>
				</div>
			</div>
	    </form>
	</body>
</html>