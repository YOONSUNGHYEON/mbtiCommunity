<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board.css" />
<script type="text/javascript" async="" src="${pageContext.request.contextPath}/resources/js/register.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript" async="" src="${pageContext.request.contextPath}/resources/js/event-handler.js"></script>
<script type="text/javascript" async="" src="${pageContext.request.contextPath}/resources/js/nav.js"></script>
</head>
<body>
	<jsp:include page="include/nav.jsp" />
	<div id="main-wrapper" class="content">
		<h1>회원가입</h1>
		<div id="content-wrapper" class="">
			<form method="post" id="registerForm">
				<fieldset>
					<div class="form-group">
						<label for="exampleInputEmail1" class="form-label mt-4">Username
						</label> <input type="text" id="id" name="username" value=""
							class="form-control" aria-describedby="emailHelp"
							placeholder="Enter id"> <small id="emailHelp"
							class="form-text text-muted">We'll never share your
							username with anyone else.</small>

					</div>
					<div class="form-group">
						<label for="exampleInputPassword1" class="form-label mt-4">Password</label>
						<input type="password" id="password" name="password"
							class="form-control" placeholder="Password">

					</div>
					<div class="form-group">
						<label for="exampleInputPassword2" class="form-label mt-4">Password
							(retype)</label> <input type="password" id="password2" name="password"
							class="form-control" placeholder="Password">

					</div>
					<div class="form-group">
						<label for="exampleSelect1" class="form-label mt-4">Example
							select</label> <select class="form-select" id="mbtiOptionSelect"
							name="mbtiOption">

						</select>
					</div>

					<button name="submit"
						class="register-btn btn btn-primary" onClick="register();">Submit</button>
				</fieldset>
			</form>
		</div>
	</div>
</html>

</body>
</html>
