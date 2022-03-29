<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cwrite</title>
</head>
<body>
	<table border="1">
	<th><h1>이승민의 To do list</h1></th>
	</table>
	
	<table border="0">
		<form action="cwrite.do" method="post">
			<tr>
				<td>제목 : </td>
				<td><input type="text" name="cName" size="30"></td>
			</tr>
			<tr>
			<td></td>
			<td></td>
			</tr>
			<tr>
			<td></td>
			<td></td>
			</tr>
			<tr>
			<td></td>
			<td></td>
			</tr>
			<tr>
			<td></td>
			<td></td>
			</tr>
			<tr>
			<td></td>
			<td></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="카테고리 이름 등록">
			</form>
			<form action="categorylist.do" method="post">
				<td colspan="2"><input type="submit" value="취소">
			</tr>
			
			</form>
	</table>
</body>
</html>