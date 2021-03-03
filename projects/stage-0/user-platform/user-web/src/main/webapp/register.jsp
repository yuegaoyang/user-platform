<head>
<jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
	<title>Register Page</title>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<script type="text/javascript">
   function onSubmit()
   {
    	var email=$("#inputEmail").attr("value");
    	alert(email);
   }
</script>
<body>
	<div class="container">
		<form class="form-signin" method="post" action="/registerUser">
			<h1 class="h3 mb-3 font-weight-normal">注册</h1>
			<label for="inputEmail" class="sr-only">请输入电子邮件</label> <input
				type="email" id="inputEmail" class="form-control"
				placeholder="请输入电子邮件" required autofocus> <label
				for="inputPassword" class="sr-only">Password</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required>
			<label for="inputUsername" class="sr-only">请输入用户名</label> <input
				type="text" id="inputUsername" class="form-control"
				placeholder="请输入用户名" required autofocus>
			<label for="inputPhone" class="sr-only">请输入电话</label> <input
				type="text" id="inputPhone" class="form-control"
				placeholder="请输入电话" required autofocus>
			<button class="btn btn-lg btn-primary btn-block" type="submit" onclick="javascript:form.submit()">提交</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
		</form>
	</div>
</body>