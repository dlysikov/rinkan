<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
Login Page
<form name='loginForm'
      action="<c:url value='/please_login_me' />" method='POST'>

    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
        </tr>
        <tr>
            <td>Remember Me:</td>
            <td><input type="checkbox" name="remember-me" /></td>
        </tr>
        <tr>
            <td colspan='2'>
                <input name="submit" type="submit" value="submit" />
            </td>
        </tr>
    </table>
    <input type="hidden"
           name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</body>
</html>
