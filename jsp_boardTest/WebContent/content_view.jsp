<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="500" cellpadding="0" cellspacing="0">
		<form action="modify.do" method="post">
			<input type="hidden" name="bId" value="${contentview.bId}">
			<tr>
				<td>번호</td>
				<td>${contentview.bId}</td>
			</tr>

			<tr>
				<td>조회수</td>
				<td>${contentview.bHit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type = "text" name ="bName" value ="${contentview.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type = "text" name ="bTitle" value ="${contentview.bTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows = "10" name ="bContent">${contentview.bContent}</textarea></td>
			</tr>
		<tr>
			<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;<a
				href="list.do">목록보기</a>&nbsp;&nbsp;<a
				href="delete.do?bId=${contentview.bId}">삭제</a>&nbsp;&nbsp;<a
				href="reply_view.do?bId=${contentview.bId}">답변</a></td>
		</tr>
		</form>
	</table>
</body>
</html>