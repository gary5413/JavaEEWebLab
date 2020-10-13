<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Browser 送出Form表單的方法</title>
<link rel="stylesheet" href="../css/lab06.css">

</head>

<body>
	<jsp:include page="/navbar_jspinclude.jsp" />
	<div class="row"></div>
	<!--   <div class="side">...</div> -->
	<div class="main">
		<div class="container">
			<form action="ProcessMember" method="GET">
				<h1>Form method=GET</h1>
				<div class="row">
					<div class="col-25">
						<label for="name">Name</label>
					</div>
					<div class="col-75">
						<input type="text" id="name" name="name" placeholder="Your Name..">
					</div>
				</div>
				<div class="row">
					<div class="col-25">
						<label for="email">E-Mail</label>
					</div>
					<div class="col-75">
						<input type="text" id="email" name="email"
							placeholder="Your Email..">
					</div>
				</div>
				<div class="row">
					<div class="col-25">
						<label for="fruit">Fruit</label>
					</div>
					<div class="col-75">
						<input TYPE='checkbox' NAME='fruit' VALUE='香蕉'> 香蕉 <br>
						<input TYPE='checkbox' NAME='fruit' VALUE='橘子'> 橘子 <br>
						<input TYPE='checkbox' NAME='fruit' VALUE='蘋果'> 蘋果 <br>
						<input TYPE='checkbox' NAME='fruit' VALUE='西瓜'> 西瓜 <br>
						<input TYPE='checkbox' NAME='fruit' VALUE='梨子'> 梨子 <br>
						<!-- <select id="fruit" name="fruit">
						<option value="apple">Apple</option>
						<option value="banana">Banana</option>
						<option value="watermelon">Watermelon</option>
						<option value="cherry">Cherry</option>
					</select> -->
					</div>
				</div>
				<div class="row">
					<input type="submit" value="Submit">
				</div>
			</form>
			<br>
			<hr>
			<form action="ProcessMember" method="POST">
				<h1>Form method=POST</h1>
				<div class="row">
					<div class="col-25">
						<label for="name">Name</label>
					</div>
					<div class="col-75">
						<input type="text" id="name" name="name" placeholder="Your Name..">
					</div>
				</div>
				<div class="row">
					<div class="col-25">
						<label for="email">E-Mail</label>
					</div>
					<div class="col-75">
						<input type="text" id="email" name="email"
							placeholder="Your Email..">
					</div>
				</div>
				<div class="row">
					<div class="col-25">
						<label for="fruit">Fruit</label>
					</div>
					<div class="col-75">
						<select id="fruit" name="fruit">
							<option value="apple">Apple</option>
							<option value="banana">Banana</option>
							<option value="watermelon">Watermelon</option>
							<option value="cherry">Cherry</option>
						</select>
					</div>
				</div>
				<div class="row">
					<input type="submit" value="Submit">
				</div>
			</form>

		</div>
		<hr>
		<a href='/JavaEEWebLab/index.jsp'>BACK</a>
	</div>

</body>
</html>