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
					<img src="${pageContext.request.contextPath}/images/banner01.jpg"
						width="100%" alt="First slide">
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/images/banner02.jpg"
						width="100%" alt="Second slide">
				</div>
				<div class="item">
					<img src="${pageContext.request.contextPath}/images/banner03.jpg"
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
	<div id="main" style="width: 80%; margin: 20px auto;">
		<table class="table">
			<thead>
				<tr>
					<th>Brand</th>
					<th>LicenceNumber</th>
					<th>Style</th>
					<th>TranspotStyle</th>
					<th>TradeMark</th>
				</tr>
			</thead>
			<tbody>
				<%
					List<HashMap<String, Object>> goodsList = (List<HashMap<String, Object>>) request
							.getAttribute("carMessage");
					for (HashMap map : goodsList) {
				%>
				<tr>
					<td>
						<%
							out.print(map.get("Brand"));
						%>
					</td>
					<td>
						<%
							out.print(map.get("LicenceNumber"));
						%>
					</td>
					<td>
						<%
							out.print(map.get("TranspotStyle"));
						%>
					</td>
					<td>
						<%
							out.print(map.get("TradeMark"));
						%>
					</td>
					<td>
						<button type="button" class="btn btn-default" title="物流信息"
							data-container="body" data-toggle="popover" data-placement="left"
							data-content="
							
							品牌：<%out.print(map.get("Brand"));%>
							编号：<%out.print(map.get("Code"));%>
							运输类型：<%out.print(map.get("TranspotStyle"));%>
							运输公司：<%out.print(map.get("TradeMark"));%>
							">
							查看</button>
					</td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
		<hr />

		<div class="btn-group" role="group" aria-label=""
			style="float: right;">${pageCode }</div>
		<br style="clear: both;">
	</div>




	<jsp:include page="../common/footter.jsp"></jsp:include>
	<script>
		$(function() {
			$("[data-toggle='popover']").popover();
		});
	</script>
</body>
</html>