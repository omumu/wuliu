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
		<form
			action="${pageContext.request.contextPath}/good/update"
			 >
			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">EndCity</span> <input
					type="text" class="form-control" value="${goods.EndCity}"
					name="endcity" aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">UserName</span> <input
					type="text" class="form-control" value="${goods.UserName}"
					name="username" aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">StartProvince</span>
				<input type="text" class="form-control"
					value="${goods.StartProvince}" name="startprovince"
					aria-describedby="sizing-addon2">
			</div>



			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">EndProvince</span>
				<input type="text" class="form-control" value="${goods.EndProvince}"
					name="endprovince" aria-describedby="sizing-addon2">
			</div>


			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">GoodsUnit</span>
				<input type="text" class="form-control" value="${goods.GoodsUnit}"
					name="goodsunit" aria-describedby="sizing-addon2">
			</div>
			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">Request</span> <input
					type="text" class="form-control" value="${goods.Request}"
					name="request" aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">GoodsName</span>
				<input type="text" class="form-control" value="${goods.GoodsName}"
					name="goodsname" aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">GoodsNumber</span>
				<input type="text" class="form-control" value="${goods.GoodsNumber}"
					name="goodsnumber" aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">TransportTime</span>
				<input type="text" class="form-control"
					value="${goods.TransportTime}" name="transporttime"
					aria-describedby="sizing-addon2">
			</div>

			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">Remark</span> <input
					type="text" class="form-control" value="${goods.Remark}"
					name="remark" aria-describedby="sizing-addon2">
			</div>


			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">Phone</span> <input
					type="text" class="form-control" value="${goods.Phone}"
					name="phone" aria-describedby="sizing-addon2">
			</div>
			
			
				<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">Style</span> <input
					type="text" class="form-control" value="${goods.Style}"
					name="style" aria-describedby="sizing-addon2">
			</div>
			
			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">GoodsStyle</span> <input
					type="text" class="form-control" value="${goods.GoodsStyle}"
					name="goodsstyle" aria-describedby="sizing-addon2">
			</div>
		
			
			<div class="input-group user_register_form">
				<span class="input-group-addon" id="sizing-addon2">StarCity</span> <input
					type="text" class="form-control" value="${goods.StarCity}"
					name="starcity" aria-describedby="sizing-addon2">
			</div>
			
			 <div class="input-group user_register_form">
				<!-- <span class="input-group-addon" id="sizing-addon2">Link</span>  --><input
					type="hidden" class="form-control" value="${goods.Link}"
					name="link" aria-describedby="sizing-addon2">
			</div>
			 
			<input type="hidden" name="gid" value="${goods.Gid}"/>
			<input type="submit" class="btn btn-primary" value="确认"
				style="float: left; margin-left: 150px;">
				
				
				 <input
				type="reset" " class="btn btn-primary" value="重置"
				style="float: right; margin-right: 50px;">

			
		</form>
		<br style="clear: both;" /> <a
			href="${pageContext.request.contentType}/">返回<<</a>
	</div>
	<jsp:include page="../common/footter.jsp"></jsp:include>
</body>
</html>
