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
	<jsp:include page="../common/header.jsp"></jsp:include>


	<div id="index_main" style="margin-top: 10px;">


		<div id="index_center">
			<div class="panel panel-default">
				<!-- Default panel contents -->
				<div class="panel-heading">货物信息</div>
				<!-- List group -->
				<a href="${pageContext.request.contextPath}/transport/goods_add.jsp"
					class="btn btn-default" style="">添加</a>

				<ul class="list-group">
					<%
						List<HashMap<String, Object>> goodsList = (List<HashMap<String, Object>>) request.getAttribute("goodsList");
						for (HashMap map : goodsList) {
					%>
					<li class="list-group-item">
						<%
							out.print(map.get("EndCity"));
						%> - <%
							out.print(map.get("Gid"));
						%> - <%
							out.print(map.get("StartProvince"));
						%> - <%
							out.print(map.get("EndProvince"));
						%> - <%
							out.print(map.get("GoodsStyle"));
						%> - <%
							out.print(map.get("StarCity"));
						%> - <%
							out.print(map.get("GoodsName"));
						%> <a
						href="${pageContext.request.contextPath}/good/getDetail?id=<%=map.get("Gid")%>"
						class="btn btn-default" style="margin-left: 15px; float: right;">操作</a>
					</li>
					<%
						}
					%>
					<li class="list-group-item"><a
						href="${pageContext.request.contextPath}/good/getallgoodmessage?page=1">更多信息>>></a></li>
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
						%> - <%
							out.print(map.get("LicenceNumber"));
						%> - <%
							out.print(map.get("Style"));
						%> - <%
							out.print(map.get("TranspotStyle"));
						%> - <%
							out.print(map.get("Code"));
						%> - <%
							out.print(map.get("TradeMark"));
						%> <a class="btn btn-default"
						style="margin-left: 15px; float: right;">操作</a>
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
						%> - <%
							out.print(map.get("EnterpriseName"));
						%> - <%
							out.print(map.get("EnterpriseSort"));
						%> - <%
							out.print(map.get("Operation"));
						%> - <%
							out.print(map.get("WorkArea"));
						%> <a class="btn btn-default"
						style="margin-left: 15px; float: right;">操作</a>
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
						%> - <%
							out.print(map.get("Title"));
						%> - <%
							out.print(map.get("Author"));
						%> - <%
							out.print(map.get("Pid"));
						%> - <%
							out.print(map.get("PissueDate"));
						%> <a class="btn btn-default"
						style="margin-left: 15px; float: right;">操作</a>
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
	<jsp:include page="../common/footter.jsp"></jsp:include>

</body>
</html>