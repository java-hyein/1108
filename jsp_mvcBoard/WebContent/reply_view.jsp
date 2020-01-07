<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>


<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>


</head>
<body>
<div class = "container">
	<div class="page-header" style = "text-align : center">
		 <h1>This is reply_view</h1> 
		    <p>( this page is where you can edit content of mvc_board )</p>     
	</div>
	<div class = "table-responsive-md">
	<table class="table table-bordered table-active">
		<form action="reply.do" method="post">
			<input type = "hidden" name = "bId" value="${reply_view.bId}">
			<input type = "hidden" name = "bGroup" value="${reply_view.bGroup}">
			<input type = "hidden" name = "bStep" value="${reply_view.bStep}">
			<input type = "hidden" name = "bIndent" value="${reply_view.bIndent}">
	<thead>
			<tr>
				<td> 번호 </td>
				<td> ${reply_view.bId} </td>
			</tr>
			<tr>
				<td> 조회수 </td>
				<td> ${reply_view.bHit} </td>
			</tr>
	</thead>
	<tbody>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="bName" size = "50" value="${reply_view.bName}"> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" size = "50"  value="${reply_view.bTitle}"> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea name="bContent" rows="10" cols="53" >${reply_view.bContent}"</textarea> </td>
			</tr>
			<tr >
				<td colspan="2">
				<input type="submit" value="답변" class="btn btn-info btn-sm"> </
				&nbsp;&nbsp; <button type="button" class="btn btn-info btn-sm"><a href="list.do"style = "color:white">목록보기</a></td></button>
			</tr>
	</tbody>
		</form>
	</table>  
</div>
</div>   
</body>
</html>