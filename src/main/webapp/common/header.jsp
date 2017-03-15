<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/bootstrap/js/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<title></title>
<style type="text/css" media="screen">
* {
	padding: 0;
	margin: 0;
}

#header {
	width: 100%;
	height: 50px;
	background-color: #333;
	min-width: 1000px;
}

#header_menu {
	padding: 0;
	margin: 0;
}

#header_menu li {
	line-height: 50px;
	font-size: 20px;
	font-family: 黑体;
	font-weight: 600;
	color: #FFF;
	list-style: none;
}

#header_menu  #logo {
	float: left;
	padding-left: 20px;
	font-size: 30px;
}

#header_menu  #logo a {
	color: #fff;
	text-decoration: none;
}

#header_menu  .menu {
	float: right;
	padding: 0px 10px;
	font-size: 16px;
}

#header_menu  .menu a:hover {
	color: #666;
	text-decoration: none;
}
</style>
</head>
<body>
	<div id="header">
		<ul id="header_menu">
			<li id="logo"><a href="${pageContext.request.contextPath}/"><lable>
					<img src="${pageContext.request.contextPath}/images/logo.png"></lable>&nbsp;物流信息网</a></li>
			<li class="menu"><a
				href="${pageContext.request.contextPath}/m/index">管理</a></li>
			<li class="menu"><a>辅助工具</a></li>
			<li class="menu"><a>企业信息</a></li>
			<li class="menu"><a href="${pageContext.request.contextPath}/car/getCarList">货物信息</a></li>
			<li class="menu"><a
				href="${pageContext.request.contextPath}/car/getAllCarList?page=1">车辆信息</a></li>

			<%-- <li class="menu"><a
				href="${pageContext.request.contextPath}/good/goodMessage">物流知识</a></li> --%>
			<li class="menu"><a
				href="${pageContext.request.contextPath}/good/getallgoodmessage?page=1">物流动态</a></li>
		</ul>
	</div>
</body>
</html>