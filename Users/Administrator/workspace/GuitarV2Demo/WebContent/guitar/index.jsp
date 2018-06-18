<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<div class="text-center">
		<label style="text-align: center;font-size: 30px;font-family: 微软雅黑">GUITAR</label>
	</div>
</div>
<caption>查询结果</caption>
<table class="table table-hover">
    <tr>
        <th>serialNumber</th>
        <th>Price</th>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.guitars}" var="guitars">
        <tr class="even gradeC">
        	<td>${guitars.serialNumber}</td>
        	<td>${guitars.price}</td>	
        </tr>
    </c:forEach> 
    </tbody>
</table>
</div>
</body>
</html>