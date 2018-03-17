<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="jquery.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>试题</title>
</head>

<body>
<%
//获取输入的值
	String count=request.getParameter("count");
	String start=request.getParameter("start");
	String end=request.getParameter("end");
//类型转换
	int count1=Integer.parseInt(count);
	int start1=Integer.parseInt(start);
	int end1=Integer.parseInt(end);
	int end2=end1-start1;
	int a=0;
//定义随机二维数组m[][]
	int m[][]=new int[2][count1];
	for(int j=0;j<2;j++){
		for(int k=0;k<count1;k++){
		m[j][k]=(int)(start1+Math.random()*(end1-start1+1));
		}
	}
//定义加法运算
%>
<form name="form2" action="../jsp/result.jsp">
<table align="center" name="table2" border="0">
<%
	 int mun[]=new int[count1];
	for(int k=0;k<count1;k++){%>
	<tr><td><%out.println(m[0][k]+"+"+m[1][k]+"="+"\t\n");
	a=m[0][k]+m[1][k];
	 mun[k]=a;	
	%>
	</td><td><input type="text" name="res" id="input"></td>
	</tr>
	<%}%>
	<tr>
	
	<td><input type="submit" value="submit">
	</td>
	<td><input type="reset" value="reset">
	</td></tr>
	
	</table>
	</form>
	
	</body>
	</html>