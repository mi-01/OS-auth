<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your-HR-Partner</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="js/foundation.js"></script>
<script src="js/app.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.js"></script>
<link rel="stylesheet" href="css/foundation.css">
<link rel="stylesheet" href="css/app.css">
</head>
<body class="img-nest">
		<h2 class="text-center blue top">Welcome to the HR Application Management
		Tool</h2>
	
	<form action="./Login" method="post"><!-- enctype='multipart/form-data' -->
		<div class="row">
			<div class="medium-6 columns">
				<label class="blue">Your User Name <input type="text"
					placeholder="username">
				</label>
			</div>
			<div class="medium-6 columns">
				<label class="blue">Your Password <input type="password"
					placeholder="***********">
				</label>
			</div>
			<div class="medium-12 columns">
				<label class="blue">Your Admin Rights<select>
						<option value="admin">Admin</option>
						<option value="user">User</option>
				</select>
				</label>
			</div>
			<div class="medium-12 columns">
				<input type="submit" class="hollow button expanded" value="Login">
			</div>
		</div>
	</form>

</body>
</html>
