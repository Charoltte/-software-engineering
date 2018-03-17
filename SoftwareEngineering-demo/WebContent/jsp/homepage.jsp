<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>四则远算</title>
</head>
<body>
<form name="form1" method="get" action="../jsp/calculate.jsp">
	<table align="center" border="0">
	<tr><th><td>需要控制的参数：</td><td></td></th></tr>
	<tr><th><td align="center">加减法</td><td><input type="checkbox" name="j" value="1"></td></th></tr>
	<tr><th><td align="center">乘除法</td><td><input type="checkbox" name="c" value="2"></td></th></tr>
	<tr><th><td align="center">有括号</td><td><input type="checkbox" name="k" value="3"></td></th></tr>
	<tr><th><td align="center">加减包括负数</td><td><input type="checkbox" name="f" value="4"></td></th></tr>
	<tr><th><td align="center">除法有余数</td><td><input type="checkbox" name="y" value="5"></td></th></tr>
	<tr><th><td align="center">支持分数</td><td><input type="checkbox" name="fs" value="6"></td></th></tr>
	<tr><th><td align="center">支持小数</td><td><input type="checkbox" name="x" value="7"></td></th></tr>
	<tr><th><td align="center">数值范围</td><td><input type="text" name="start" >-<input type="text" name="end" ></td></th></tr>
	<tr><th><td></td><td></td></th></tr>
	<tr><th><td>需要的题数：</td><td><input type="text" name="count"></td></th></tr>
	<tr>
	<th>
	<td><input type="submit" value="submit">
	</td>
	<td><input type="reset" value="reset">
	</td></th></tr>
	
	</table>
</form>
</body>
</html>