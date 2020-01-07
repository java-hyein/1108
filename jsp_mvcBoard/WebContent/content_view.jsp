<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div class = "container">
		<div class="page-header" style = "text-align : center">
		    <h1>This is content_view</h1> 
		    <p>( this page is where you can see the content of mvc_board )</p>     
		  </div>
		<div class = "table-responsive-md">
		<table class="table table-bordered table-active">
			<form action="modify.do" method="post">
				<input type="hidden" name="bId" value="${content_view.bId}">
			<thead>
				<tr >
					<td> 번호 </td>
					<td> ${content_view.bId} </td>
				</tr>
				<tr>
					<td> 조회수 </td>
					<td> ${content_view.bHit} </td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> 이름 </td>
					<td> <input type="text" name="bName" size = 50 value="${content_view.bName}"></td>
				</tr>
				<tr>
					<td> 제목 </td>
					<td> <input type="text" name="bTitle"  size = 50 value="${content_view.bTitle}"></td>
				</tr>
				<tr>
					<td> 내용 </td>
					<td> <textarea rows="10" name="bContent" cols="53">${content_view.bContent}</textarea></td>
				</tr>
				<tr>
					<td colspan="2"> 
					<input type="submit" value="수정" class="btn btn-info btn-sm">
					 &nbsp;&nbsp; <button type="button" class="btn btn-info btn-sm"> <a href="list.do" style = "color:white">목록보기</a> </button>
					 &nbsp;&nbsp; <button type="button" class="btn btn-info btn-sm"> <a href="reply_view.do?bId=${content_view.bId}" style = "color:white">답변</a></button>
					 &nbsp;&nbsp; <button type="button" class="btn btn-info btn-sm"> <a href="delete.do?bId=${content_view.bId}" style = "color:white">삭제</a></td></button>
				</tr>
			</tbody>
			</form>
	</table>
	</div>
	</div>
</body>
</html>