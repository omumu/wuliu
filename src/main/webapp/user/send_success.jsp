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

<title>邮件发成功</title>

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

		<h1>${msg }</h1>

		</form>
		<br style="clear: both;" /> <a
			href="${pageContext.request.contextPath}/">返回<<</a>
	</div>
	<jsp:include page="../common/footter.jsp"></jsp:include>
</body>
</html>
