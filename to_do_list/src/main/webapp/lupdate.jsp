<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">

	function del(){
		if(confirm("삭제 완료 되었습니다")){
			location.href = "detaillist.do"
		}
	}
	
	function update(){
		if(confirm("수정 완료 되었습니다")){
			location.href = "detaillist.do"
		}
	}
</script>


		<table>
			<tr>
				<!-- <td align="left"></td> -->
				<td align="center">리스트 수정</td>
			</tr>
			
			<tr>
				<td align="right">내용 : </td>
					<td><textarea rows="5" cols="20" name="wContent" >${lupdate.wContent}</textarea></td>
			</tr>
			<tr>
				<td align="right">시작날짜 : </td>
				<td><input type="text" name="wStart" size="20" value="${lupdate.wStart }" ></td>
			</tr>
			
			<tr>
				<td align="right">종료날짜 : </td>
				<td><input type="text" name="wEnd" size="20" value="${lupdate.wEnd}"></td>
			</tr>
			
			<tr>
				<td align="right">중요도 : </td>
				<td><input type="radio" name="wImport" value="" checked="checked">상
					  <input type="radio" name="wImport" value=""> 중 
					  <input type="radio" name="wImport" value=""> 하 </td>
			</tr>
			
			<tr>
				<td align="right">완료여부 : </td>
				<td><input type="radio" name="wFinish" value="" checked="checked">O
					<input type="radio" name="wFinish" value="" checked="checked">X
				</td>
				
			</tr>
			
			<tr>
			<td colspan="2"><input type="button" value="수정" onclick="update()">
							<input type="button" value="삭제" onclick="del()">
			</tr>
			
		</table>
	
</body>
</html>