<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Server LifeCycle</title>
</head>
<body>

<a href="ServletLifeCycle">[Reload]</a> | <a href="DestroyServlet">[Destroy Session]</a> <br>  <!-- Calls the Servlet -->
 <br>
 <h3>Session Data</h3>
 <br>
<!-- Displays the Session Information --> 
New Session: ${sessionScope.session}<br>
Session ID: ${sessionScope.id}<br>
Create Time: ${sessionScope.createTime}<br>
Last Accessed Time ${sessionScope.lastAccessTime}<br>
Number of Accesses: ${sessionScope.visitCountKey}

</body>
</html>