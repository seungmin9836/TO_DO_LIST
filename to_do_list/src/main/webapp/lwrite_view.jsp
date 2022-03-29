<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성</title>
</head>
<body>

	<table border="1">
<!--	???    -->
	</table>
	
	<h3>리스트 입력</h3>
	
	<table border="0">
		<form action="lwrite.do" method="post">
			<tr>
				<td align="right">내용</td>
				<td><textarea name ="wContent" rows="20" cols="50"></textarea></td>
			</tr>
			<tr>
				<td align="right">시작 날짜</td>
				<td><input type="datetime" name="wStart" size="30"></td>
			</tr>
			<tr>
				<td align="right">종료 날짜</td>
				<td><input type="datetime" name="wEnd" size="30"></td>
			</tr>
			<tr>
				<td align="right">중요도</td>
				<td><input type="radio" name="wImport" checked="checked" value="상">상
					<input type="radio" name="wImport" value="중">중
					<input type="radio" name="wImport" value="하">하</td>
			</tr>
			<tr>
				<td align="right">완료 여부</td>
				<td><input type="radio" name="wFinish" checked="checked" value="X">X
					<input type="radio" name="wFinish" value="O">O</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="입력">&nbsp;&nbsp;&nbsp;
				<a href="categorylist.do">목록</a>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>