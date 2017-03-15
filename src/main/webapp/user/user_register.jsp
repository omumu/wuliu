<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>用户注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.user_register_form {
	margin-bottom: 20px;
}
</style>
</head>

<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<div id="user_info"
		style="width: 30%; margin: 0 auto; margin-top: 30px; margin-bottom: 20px;">
		<form action="${pageContext.request.contextPath}/Custormar/add" method="POST">
			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">用户名</span> <input
					type="text" class="form-control" placeholder="用户名" name="name"
					aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">密码</span> <input
					type="text" class="form-control" placeholder="密码" name="password"
					aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">确认密码</span> <input
					type="text" class="form-control" placeholder="确认密码"
					name="repassword" aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2" >性別</span>
				<select class="form-control" name="sex">
					<option value="1">男</option>
					<option value="0">女</option>
				</select>
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">电话</span> <input
					type="text" class="form-control" placeholder="电话" name="phone"
					aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">Email</span> <input
					type="text" class="form-control" placeholder="Email" name="email"
					aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">找回密码的问题</span> <input
					type="text" class="form-control" placeholder="找回密码的问题"
					name="question" aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">问题答案</span> <input
					type="text" class="form-control" placeholder="问题答案" name="result"
					aria-describedby="sizing-addon2">
			</div>

			<input type="submit" class="btn btn-primary" value="确认"
				style="float: left; margin-left: 150px;"> <input
				type="reset" " class="btn btn-primary" value="重置"
				style="float: right; margin-right: 50px;">

			<p>${msg }</p>
			
		</form>
		<br style="clear: both;" /> <a href="${pageContext.request.contentType}/">返回<<</a>
	</div>
	<jsp:include page="../common/footter.jsp"></jsp:include>
</body>
</html>
