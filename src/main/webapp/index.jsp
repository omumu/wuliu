<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物流信息网</title>
<style type="text/css">
#index_main {
	width: 80%;
	margin: 0 auto;
	min-width: 1000px;
}

#index_left {
	width: 20%;
	float: left;
}

#index_center {
	width: 50%;
	float: left;
	margin-left: 5%;
}

#index_right {
	width: 20%;
	float: left;
	margin-left: 5%;
}
</style>
</head>
<body style="padding: 0; margin: 0;">
	<jsp:include page="common/header.jsp"></jsp:include>
	<div id="banner"">

		<div id="myCarousel" class="carousel slide">
			<!-- 轮播（Carousel）指标 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner" style="height: 450px;">
				<div class="item active">
					<img src="${pageContext.request.contextPath}/images/banner03.jpg"
						width="100%" alt="First slide">
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/images/banner02.jpg"
						width="100%" alt="Second slide">
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/images/banner01.jpg"
						width="100%" alt="Third slide">
				</div>
			</div>
			<!-- 轮播（Carousel）导航 -->
			<a class="carousel-control left" href="#myCarousel" data-slide="prev"></a>
			<a class="carousel-control right" href="#myCarousel"
				data-slide="next"></a>
		</div>
	</div>
	<!-- banner完成-->

	<div id="index_main" style="margin-top: 10px;">

		<div id="index_left">
						<%
							Object aaaaa=request.getParameter("msg");
							if(aaaaa!=null){
								pageContext.setAttribute("msg", aaaaa);
							}
							%>

			<!-- 这里要做一个 是否登录的 判断 -->
			<div class="panel panel-default">
				<div class="panel-heading">用户登录</div>
				<div class="panel-body">
					<%
						Object o = session.getAttribute("username");
						if (o == null) {
					%>
					<form action="${pageContext.request.contextPath}/Custormar/login"
						method="Post" style="width: 80%; margin: 0 auto;">
						<label style="font-family: 黑体;">用户名：</label> <input type="text"
							class="form-control" placeholder="username" name="username"
							aria-describedby="basic-addon1"><br> <label
							style="font-family: 黑体;">密 &nbsp;码：</label> <input
							type="password" class="form-control" name="password"
							placeholder="password" aria-describedby="basic-addon1"
							style="margin-bottom: 20px;" /> <input class="btn btn-default"
							type="submit" value="提交" style="margin-left: 5px;" /> <input
							class="btn btn-default" type="reset" value="重置"
							style="float: right; margin-right: 5px;" /> <br
							style="clear: both;" />
					</form>
					<p>${msg}</p>
					<span
						style="display: block; margin-top: 20px; margin-left: 5px; float: left;"><a
						href="${pageContext.request.contextPath}/user/user_register.jsp">
							新注册 </a></span> <span
						style="display: block; margin-top: 20px; float: right; margin-right: 5px;"><a
						href="${pageContext.request.contextPath}/user/user_find_pwd.jsp">
							找回密码 </a></span>
					<%
						} else {
					%>

					欢迎： ${username } <br /> <a
						href="${pageContext.request.contextPath}/Custormar/exit">退出</a>

					<%
						}
					%>



				</div>
			</div>
		</div>
		<!-- left完成 -->
		<div id="index_center">
			<div class="panel panel-default">
				<!-- Default panel contents -->
				<div class="panel-heading">货物信息</div>
				<!-- List group -->
				<ul class="list-group">
					<%
						List<HashMap<String, Object>> goodsList = (List<HashMap<String, Object>>) request.getAttribute("goodsList");
						for (HashMap map : goodsList) {
					%>
					<li class="list-group-item">
						<%
							out.print(map.get("EndCity"));
						%>
						-
						<%
							out.print(map.get("Gid"));
						%>
						-
						<%
							out.print(map.get("StartProvince"));
						%>
						-
						<%
							out.print(map.get("EndProvince"));
						%>
						-
						<%
							out.print(map.get("GoodsStyle"));
						%>
						-
						<%
							out.print(map.get("StarCity"));
						%>
						-
						<%
							out.print(map.get("GoodsName"));
						%>
					</li>
					<%
						}
					%>
					<li class="list-group-item"><a href="${pageContext.request.contextPath}/good/getallgoodmessage?page=1">更多信息>>></a></li>
				</ul>
			</div>

			<div class="panel panel-default">
				<!-- Default panel contents -->
				<div class="panel-heading">车辆信息</div>
				<ul class="list-group">
					<%
						List<HashMap<String, Object>> carsList = (List<HashMap<String, Object>>) request.getAttribute("carsList");
						for (HashMap map : carsList) {
					%>
					<li class="list-group-item">
						<%
							out.print(map.get("Brand"));
						%>
						-
						<%
							out.print(map.get("LicenceNumber"));
						%>
						-
						<%
							out.print(map.get("Style"));
						%>
						-
						<%
							out.print(map.get("TranspotStyle"));
						%>
						-
						<%
							out.print(map.get("Code"));
						%>
						-
						<%
							out.print(map.get("TradeMark"));
						%>
					</li>
					<%
						}
					%>
					<li class="list-group-item"><a href="${pageContext.request.contextPath}/car/getAllCarList?page=1">更多信息>>></a></li>
				</ul>
			</div>


			<div class="panel panel-default">
				<div class="panel-heading">企业信息</div>
				<ul class="list-group">
					<%
						List<HashMap<String, Object>> eList = (List<HashMap<String, Object>>) request.getAttribute("eList");
						for (HashMap map : eList) {
					%>
					<li class="list-group-item">
						<%
							out.print(map.get("Eid"));
						%>
						-
						<%
							out.print(map.get("EnterpriseName"));
						%>
						-
						<%
							out.print(map.get("EnterpriseSort"));
						%>
						-
						<%
							out.print(map.get("Operation"));
						%>
						-
						<%
							out.print(map.get("WorkArea"));
						%>
					</li>
					<%
						}
					%>
					<li class="list-group-item"><a>更多信息>>></a></li>
				</ul>
			</div>
		</div>

		<!-- center完成 -->
		<div id="index_right">

			<div class="panel panel-default">
				<div class="panel-heading">本地公告</div>
				<div class="panel-body">
					<%
						List<HashMap<String, Object>> palList = (List<HashMap<String, Object>>) request.getAttribute("plaList");
						for (HashMap map : palList) {
					%>
					<li class="list-group-item">
						<%
							out.print(map.get("Content"));
						%>
						-
						<%
							out.print(map.get("Title"));
						%>
						-
						<%
							out.print(map.get("Author"));
						%>
						-
						<%
							out.print(map.get("Pid"));
						%>
						-
						<%
							out.print(map.get("PissueDate"));
						%>
					</li>
					<%
						}
					%>

				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">企业链接</div>
				<div class="panel-body">
					<a href="${pageContext.request.contextPath}/">飞快物流网</a>
				</div>
			</div>
		</div>

	</div>

	<br style="clear: both;" />

	<!--main完成 -->
	<jsp:include page="common/footter.jsp"></jsp:include>

</body>
</html>