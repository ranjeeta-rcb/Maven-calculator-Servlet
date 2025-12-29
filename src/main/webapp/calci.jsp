
<%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculate</title>
</head>
<body>

<div align="center">

<form action="calculate">

<input type="number" value="${x}" placeholder="enter the num1" name="num1">
<input type="number" value="${y}" placeholder="enter the num2" name="num2">

<button name="operation" value="add">+</button>
<button name="operation" value="sub">-</button>
<button name="operation" value="mul">*</button>
<button name="operation" value="div">/</button>

</form>

<input type="text" placeholder="Answer" value="${answer}">

</div>

</body>
</html>