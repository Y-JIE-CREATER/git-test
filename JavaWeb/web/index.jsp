<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登录</title>
		<!--使用bootstrap框架 必须导入一下内容-->
		<script type="text/javascript" src="js/jquery-3.3.1.js" ></script>
		<script type="text/javascript" src="js/bootstrap.js" ></script>
		<link rel="stylesheet" href="css/bootstrap.css" />
		<!--以下部分添加自己的样式或者脚本文件-->
		<style>
			form{
				margin-top: 50px;
			}
		</style>
	</head>
	<body>
			
			<form action="${pageContext.request.contextPath }/LoginDo" method="post" class="form-horizontal" style="width:500px;">
			<div class="form-group">
				<label class="col-lg-3 control-label">用户名：</label>
				<div class="col-lg-6">
					<input class="form-control" name="uname" placeholder="请输入用户名" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-3 control-label">密码：</label>
				<div class="col-lg-6">
					<input class="form-control" name="pwd" type="password" placeholder="请输入密码" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-offset-3 col-lg-6">
					<button class="btn btn-success" type="submit">登录</button>
					<button class="btn btn-info" type="reset">重置</button>
				</div>
			</div>
		</form>
	</body>
</html>
