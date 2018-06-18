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
<form role="form" method="post" action="/guitar/search">
    <div class="form-group">
        <label for="1">Builder</label>
        <select class="form-control" name="builder" id="1">
            <option  value="COLLINGS">COLLINGS</option>
            <option  value="FENDER">FENDER</option>
            <option  value="MARTIN">MARTIN</option>
            <option  value="GIBSON">GIBSON</option>          
            <option  value="OLSON">OLSON</option>
            <option  value="RYAN">RYAN</option>
            <option  value="PRS">PRS</option>
            <option  value="UNSPECIFIED">UNSPECIFIED</option>
        </select>
        <label for="2">Model</label>
        <select class="form-control" name="model1" id="2">
            <option value="CJ">CJ</option>
            <option value="D-18">D-18</option>
            <option value="Stratocastor">Stratocastor</option>
            <option value="Les Paul">Les Paul</option>
            <option value="SG '61 Reissue">SG '61 Reissue</option>
            <option value="F-5G">F-5G</option>
            <option value="RB-3 Wreath">RB-3 Wreath</option>
        </select>
        <label for="3">Type</label>
        <select class="form-control" name="type" id="3">
            <option value="ACOUSTIC">ACOUSTIC</option>
            <option value="ELECTRIC">ELECTRIC</option>
        </select>
        <label for="4">BackWood</label>
        <select class="form-control" name="backWood" id="4">
            <option value="INDIAN_ROSEWOOD">INDIAN_ROSEWOOD</option>
        	<option value="SITKA">SITKA</option>
        	<option value="ADIRONDACK">ADIRONDACK</option>
        	<option value="INDIAN_ROSEWOOD">INDIAN_ROSEWOOD</option>
        	<option value="ALDER">ALDER</option>
        	<option value="MAPLE">MAPLE</option>
        	<option value="MAHOGANY">MAHOGANY</option>
        </select>
        <label for="5">TopWood</label>
        <select class="form-control" name="topWood" id="5">
            <option value="SITKA">SITKA</option>
            <option value="INDIAN_ROSEWOOD">INDIAN_ROSEWOOD</option>
            <option value="MAHOGANY">MAHOGANY</option>
            <option value="ALDER">ALDER</option>
            <option value="SITKA">SITKA</option>
            <option value="MAPLE">MAPLE</option>
        </select>
        <label for="6"> NumStrings</label>
        <select class="form-control" name="numStrings" id="6">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
        </select>
    </div>
    <input type="submit" value="搜索">
</form>
</div>
</body>
</html>